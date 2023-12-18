import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] Link = new int[N][N];
        Set<Integer> Node = new HashSet<>();
        for(int [] L :Link)Arrays.fill(L,0);
        for(int i=0;i<M;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            Link[x-1][y-1]=1;
            Node.add(x);
        }
        int max = 0;
        for(int i:Node){
            int num = LP(Link,i,N,0,0);
            if(max<num) max = num;
        }
        System.out.println(max);
    }
    public static int LP(int [][] Link,int source,int N,int max,int d){
        boolean check = false;
        for(int i=1;i<=N;i++){
            if(Link[source-1][i-1]==1) {
                int num = d+1;
                max =  LP(Link,i,N,max,num);
                check =true;
            }
        }
        if(!check)if(d>max)max = d;
        return max;
    }
}