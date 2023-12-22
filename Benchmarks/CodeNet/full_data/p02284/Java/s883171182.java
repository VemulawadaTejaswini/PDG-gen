import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int cnt = 0,root_value = -1;
        ArrayList<Node> T = new ArrayList<>();
        Map<Integer,Integer> L = new HashMap<>();
        for(int i=0;i<n;i++){
            String s = sc.next();
            if(s.charAt(0)=='i') {
               int value=sc.nextInt();
               if(cnt==0) {
                   root_value=value;
                   Node v = new Node();
                   v.element(value,-1,-1,-1);
                   T.add(v);
                   L.put(value,0);
               }
               else insert(T,L,value,root_value);
               cnt++;
            }
            else if(s.charAt(0)=='f'){
                int value = sc.nextInt();
                boolean check = find(T,L,value,L.get(root_value),false);
                if(check) System.out.println("yes");
                else System.out.println("no");
            }
            else{
                StringBuilder I = new StringBuilder();
                StringBuilder P = new StringBuilder();
                Order(T,L,root_value,I,P);
                System.out.println(I);
                System.out.println(P);
            }
        }
    }
    public static void Order(ArrayList<Node> T,Map<Integer,Integer> L,int now,StringBuilder I,StringBuilder P){
        int num = L.get(now);
        P.append(" "+now);
        if(T.get(num).left!=-1) Order(T,L,T.get(num).left,I,P);
        I.append(" "+now);
        if(T.get(num).right!=-1) Order(T,L,T.get(num).right,I,P);
    }
    public static void insert(ArrayList<Node> T,Map<Integer,Integer> L,int value,int root_value){
        int index = L.get(root_value);
        if(root_value>=value){
            if(T.get(index).left!=-1) insert(T,L,value,T.get(index).left);
            else{
                T.get(index).left = value;
                Node v = new Node();
                v.element(value,root_value,-1,-1);
                T.add(v);
                L.put(value,T.size()-1);
            }
        }
        else{
            if(T.get(index).right!=-1)insert(T,L,value,T.get(index).right);
            else{
                T.get(index).right = value;
                Node v = new Node();
                v.element(value,root_value,-1,-1);
                T.add(v);
                L.put(value,T.size()-1);
            }
        }
    }
    public static boolean find(ArrayList<Node> T,Map<Integer,Integer> L,int value,int now_id,boolean check){
        if(T.get(now_id).value==value) return true;
        else if (T.get(now_id).value>value&&T.get(now_id).left!=-1)  check = find(T,L,value,L.get(T.get(now_id).left),check);
        else if(T.get(now_id).value<value&&T.get(now_id).right!=-1)check = find(T,L,value,L.get(T.get(now_id).right),check);
        return check;
    }
    public static class Node{
        int value,parent,left,right;
        public void element(int value,int parent,int left,int right){
            this.value = value;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
    }
}
