import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/06.
 */
public class ScoreTotalizer {
    public static void main(String ars[]){
        int n, tmp, ave;
        String line;
        int score[] = new int[100];
        Scanner sc = new Scanner(System.in);

        while(true){
            ave = 0;
            n = sc.nextInt();
            if(n == 0) break;
            for(int i = 0; i < n; i++) score[i] = sc.nextInt();
            for(int i = 0; i < n; i++) {
                for (int j = n-1; j > i; j--) {
                    if (score[j] < score[j-1]) {
                        tmp = score[j-1];
                        score[j-1] = score[j];
                        score[j] = tmp;
                    }
                }
            }
            for(int i = 1; i < n-1; i++) ave += score[i];
            ave /= n-2;
            System.out.println(ave);
        }


    }
}