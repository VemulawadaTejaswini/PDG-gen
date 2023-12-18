import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] Array = new int[N];
        for(int i = 0; i < N; i++){
            Array[i] = scan.nextInt();
        }
        int count = 0;

        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += Array[k];
                }
                if(sum % M == 0)count++;
            }
        }
        System.out.println(count);
    }
}
