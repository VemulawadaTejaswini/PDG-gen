import java.util.ArrayDeque;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true){
            int N = sc.nextInt();
            int M = sc.nextInt();
            if(N==0 && M==0) break;

            int min = Integer.MAX_VALUE;
            ArrayDeque<int[]> stack = new ArrayDeque<int[]>();

            int[] Cm = new int[M];
            for (int i=0; i<M;i++){
                Cm[i] = sc.nextInt();
            }
            int[] x = new int[N];
            for (int i=0; i<N ;i++){
                x[i]=sc.nextInt();
            }

            stack.offer(new int[]{0,128,0});

            while (!stack.isEmpty()){
                int[] current = stack.poll();

                if(current[2]>min) continue;
                if (current[0]==N){
                    if(current[2]<min) min=current[2];
                    continue;
                }

                for (int i=0;i<M;i++){
                    int thisValue = current[1]+Cm[i];
                    if(thisValue<0) thisValue=0;
                    else if (thisValue>255) thisValue=255;

                    int dif=Math.abs(x[current[0]]-thisValue);
                    stack.push(new int[]{current[0]+1,thisValue,current[2]+(dif*dif)});
                }
            }

            System.out.println(min);

        }
    }
}