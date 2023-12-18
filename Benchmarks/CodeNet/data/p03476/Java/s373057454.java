import java.util.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int Q = sc.nextInt();
        int[] l = new int[Q];
        int[] r = new int[Q];

        for(int i=0; i<Q; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        ArrayList<Integer> list  = new ArrayList<>();
        for(int i=2; i<=100000; i++){
            list.add(i);
        }

        for(int i=0; i<list.size(); i++){
            int x = i + 1;
            while(x<list.size()){
                if(list.get(x)%list.get(i)==0){
                    list.remove(x);
                }
                else{
                    x++;
                }
            }
        }
        int x = 0;
        int[] c = new int[100001];
        c[1] = 0;
        for(int i=2; i<=100000; i++){
            if(i==list.get(x)){
                if(list.contains((i+1)/2)){
                    c[i] = c[i - 1] + 1;
                }
                else{
                    c[i] = c[i - 1];
                }
                if(x!=list.size()-1){
                    x++;
                }
            }
            else{
                c[i] = c[i - 1];
            }
        }
        System.out.println(c[3] + " "+c[7]);
        for(int i=0; i<Q; i++){
            System.out.println(c[r[i]] - c[l[i] - 1]);
        }
    }
}