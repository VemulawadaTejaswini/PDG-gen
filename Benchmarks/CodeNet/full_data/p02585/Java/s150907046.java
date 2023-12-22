
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] p = new int[n+1];
        int[] c = new int[n+1];
        for(int i=0;i<n;i++){
            p[i+1] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            c[i+1] = sc.nextInt();
        }

        int[] circleLength = new int[n+1];
        long[] circleScore = new long[n+1];
        for(int i=1;i<n+1;i++){
            if(circleLength[i] != 0){
                continue;
            }
            ArrayList<Integer> pass = new ArrayList<>();
            int current = i, count = 0;
            long tempScore = 0;
            do{
                count++;
                pass.add(p[current]);
                current = p[current];
                tempScore += c[current];
            }while(current != i);
            for(int iter : pass){
                circleLength[iter] = count;
                circleScore[iter] = tempScore;
            }
        }

        long maxScore = -99999999999999999L;
        for(int i=1;i<n+1;i++){
            long gameScore = Math.max((k / circleLength[i]) * circleScore[i], 0);
            int remainMove = (int)(k % circleLength[i]);
            if(remainMove == 0){
                gameScore = Math.max((k / circleLength[i] - 1) * circleScore[i], 0);
                remainMove = (int)(k % circleLength[i]) + circleLength[i];
            }
            int current = i;
            for(int j=0;j<remainMove;j++){
                current = p[current];
                gameScore += c[current];
                maxScore = Math.max(maxScore, gameScore);
            }
        }

        System.out.println(maxScore);
    }
}
