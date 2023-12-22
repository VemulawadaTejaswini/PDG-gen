import java.util.*;

public class Main{
    public static void main(String[] args){
        int n;
        float ave;
        float s;
        
        Scanner scanner = new Scanner(System.in);

        while(true){
            n = scanner.nextInt();
            if(n == 0) break;

            int[] score;
            score = new int[n];

        
            int i;
            ave = 0;
            for(i = 0; i < n; i++){
                score[i] = scanner.nextInt();
                ave = ave + score[i];
            }

            ave = ave / n;

            s = 0;
            for(i = 0; i < n; i++){
                s = s + (ave - score[i]) * (ave - score[i]);
            }

            s = s / n;
            s = (float)Math.sqrt(s);
            System.out.println(s);

            

        }


        scanner.close();
    }
}
