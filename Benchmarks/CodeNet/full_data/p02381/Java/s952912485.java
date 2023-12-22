import java.util.Scanner;

public class Main{
public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)){
        while(true){
        double average = 0, variance = 0,total = 0,total2 = 0;
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }
            int[] scores = new int[n];
            for(int i =0;i < scores.length;i++){
                scores[i] = sc.nextInt();
            }
            for(int j = 0; j < scores.length;j++) {
                total += scores[j];
                average = total / scores.length;
            }
            for(int k = 0; k < scores.length;k++) {
                total2 += (scores[k] - average) * (scores[k] - average);
                variance = total2 / scores.length;
            }
            System.out.println(Math.sqrt(variance));
        }
    }
}
}

