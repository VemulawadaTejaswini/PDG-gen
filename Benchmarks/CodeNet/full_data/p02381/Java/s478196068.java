import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                double sum = 0, ave, var = 0;
                int n = sc.nextInt();
                if(n==0) break;
                int[] scores = new int[n];
                for(int i=0;i<n;i++) {
                    scores[i] = sc.nextInt();
                    sum += scores[i];
                }
                ave = sum/n;

                for(int i=0; i<n; i++){
                    var += Math.pow((scores[i] - ave),2)/n;
                }

                System.out.printf("%f\n",Math.sqrt(var));
            }
        }
    }
}
