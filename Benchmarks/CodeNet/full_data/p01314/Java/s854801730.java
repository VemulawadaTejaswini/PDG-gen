import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int N;

        while((N = scan.nextInt()) != 0){
            int count = 0;
            int sum = 0;
            for(int i=0; i*2<N; i++){
                for(int j=i; sum<N; j++){
                    sum += j;

                    if(sum == N){
                        count++;
                    }
                }
                sum = 0;
            }

            System.out.println(count);
        }
    }
}