import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt(), M = sc.nextInt();
        int[][] route = new int[M][2];
        for(int i=0;i<M;i++){
            route[i][0] = sc.nextInt()-1;   //最後に1を足せ
            route[i][1] = sc.nextInt()-1;
        }

        List<Integer>[] destination = new List[N];
        for(int i=0; i<destination.length; i++) {
            destination[i]= new ArrayList<Integer>();
        }
        for(int i=0; i<M; i++) {
            destination[route[i][0]].add(route[i][1]);
            destination[route[i][1]].add(route[i][0]);
        }

        int[] clear = new int[N];
        for(int i=0; i<clear.length; i++) {
            if(i!=0) {
                clear[i]=-1;
            }
        }

        Queue<Integer> queue = new ArrayDeque();
        queue.add(0);

        while(!queue.isEmpty()) {
            int x=queue.poll();
            for(int j: destination[x]) {
                if(clear[j]==-1) {
                    queue.add(j);
                    clear[j]=x;
                }
            }
        }
        for(int i=0; i<clear.length; i++) {
            if(clear[i]==-1) {
                System.out.println("No");
                break;
            }
        }
        System.out.println("Yes");
        for(int i=1; i<clear.length; i++) {
            System.out.println(clear[i]+1);
        }
    }

}
