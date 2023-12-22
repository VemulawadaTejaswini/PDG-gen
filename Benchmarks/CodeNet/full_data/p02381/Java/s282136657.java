import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            int n = sc.nextInt();
            if(n == 0){
                break;
            }

            int score[] = new int[n];
            int i;
            double sum = 0;
            for(i = 0; i < n; i++){
                score[i] = sc.nextInt();
                sum += score[i];
            }

            int j;
            double a = 0;
            for(j = 0; j < n; j++){
                a += (score[j] - sum / n) * (score[j] - sum / n);
            }

            System.out.println(Math.sqrt(a / n));

        }

        sc.close();

    }
}
