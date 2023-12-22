import java.util.Scanner;
import java.util.Stack;


public class Main {
    static Scanner sc = new Scanner(System.in);

    static class Value{
        int num;
        int value;
        int ans;

        public Value(int num, int value,int ans) {
            this.num = num;
            this.value = value;
            this.ans = ans;
        }
    }

    public static void main(String[] args) {

        while (true){
            int N = sc.nextInt();
            int M = sc.nextInt();
            if(N==0 && M==0) break;

            int min = Integer.MAX_VALUE;
            Stack stack = new Stack();

            int[] Cm = new int[M];
            for (int i=0; i<M;i++){
                Cm[i] = sc.nextInt();
            }
            int[] x = new int[N];
            for (int i=0; i<N ;i++){
                x[i]=sc.nextInt();
            }

            stack.push(new Value(0,128,0));

            while (!stack.empty()){
                Value current = (Value) stack.pop();

                if(current.ans>min) continue;
                if (current.num==N){
                    if(current.ans<min) min=current.ans;
                    continue;
                }

                for (int i=0;i<M;i++){
                    int thisValue = current.value+Cm[i];
                    if(thisValue<0) thisValue=0;
                    else if (thisValue>255) thisValue=255;

                    int dif=Math.abs(x[current.num]-thisValue);
                    stack.push(new Value(current.num+1,thisValue,current.ans+(dif*dif)));
                }
            }

            System.out.println(min);

        }
    }
}