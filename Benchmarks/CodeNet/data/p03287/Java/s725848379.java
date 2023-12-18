import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] Array = new int[N];
        int count = 0;
        for(int i = 0; i < N; i++){
            Array[i] = scan.nextInt() % M;
        }
        for(int i = 0; i < N; i++){
            int sum = 0;
            for(int k = i; k < N; k++){
                sum = (sum + Array[k]) % M;
                if(sum == 0)count++;
            }
        }
        System.out.println(count);
    }
}
