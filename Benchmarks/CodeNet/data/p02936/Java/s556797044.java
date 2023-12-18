
import java.util.*;

class Main {
    static int toAdd=0;
    static Node[] nodes;
    static int[] p;
    static int[] ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        nodes=new Node[n];
        ans=new int[n];
        for(int i=0;i<n;i++){
            nodes[i]=new Node();
        }
        int a;
        int b;
        for(int i=0;i<n-1;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            nodes[a-1].son.add(b-1);
            nodes[b-1].parent=a-1;
        }
        p=new int[n];
        for(int i=0;i<q;i++){
            p[sc.nextInt()-1]+=sc.nextInt();
        }
        toAdd=p[0];
        ans[0]=toAdd;
        search(0);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    static void search(int now){
        int size;
        if(nodes[now].son.size()>0){
            size=nodes[now].son.size();
            for(int i=0;i<size;i++){
                toAdd+=p[nodes[now].son.peek()];
                ans[nodes[now].son.peek()]+=toAdd;
                search(nodes[now].son.poll());
            }
            
        }else{
            toAdd-=p[now];
            return;
        }
    }

}
class Node{
    int parent;
    PriorityQueue<Integer> son=new PriorityQueue<>();
}
