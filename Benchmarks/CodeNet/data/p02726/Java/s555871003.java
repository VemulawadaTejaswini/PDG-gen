import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt() - 1;
        int Y = scanner.nextInt() - 1;
        int[] dis = new int[N];
        int[] count = new int[N];

        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for(int i=0; i<N; i++){
            g.add(new ArrayList<>());
        }
        for(int i=0; i<N; i++){
            if(i!=0){
                g.get(i).add(i-1);

            }
            if(i!=N-1){
                g.get(i).add(i+1);
            }
        }
        g.get(X).add(Y);
        g.get(Y).add(X);

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                dis[j] = N * 2;
            }
            dis[i] = 0;
            extend(g, i, dis);

            for(int j=0; j<N; j++){
                count[dis[j]]++;
            }
        }
        for(int i=1;i<N;i++){
            System.out.println(count[i]/2);
        }

    }
    public static void extend(ArrayList<ArrayList<Integer>> g, int current, int[] dis){
        for(Integer i: g.get(current)){
            if(dis[i] > dis[current] + 1){
                dis[i] = dis[current] + 1;
                extend(g, i, dis);
            }
        }
    }
}