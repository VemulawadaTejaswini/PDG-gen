import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            while(true){
                int n = sc.nextInt();
                if(n==0){
                    break;
                }
                int[] scores = new int[n];
                for(int i = 0; i<scores.length;i++){
                    scores[i]=sc.nextInt();
                }
                double average = 0;
                double variance = 0;
                int sum=0;
                for(int i=0; i<scores.length;i++){
                    sum+=scores[i];
                }
                average=(double)sum/(double)scores.length;
                double sum2=0.0;
                for(int i=0;i<scores.length;i++){
                    sum2+=(scores[i]-average)*(scores[i]-average);
                }
                variance=sum2/scores.length;
                System.out.println(Math.sqrt(variance));

            }
        }
    }
}
