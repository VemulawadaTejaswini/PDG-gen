import java.util.ArrayList;
import java.util.Scanner;

public class ICPC_score{
    public static void main(String[] args){
        int n = 1;

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        while(n !=0){
            ArrayList<Integer> score = new ArrayList<Integer>();
            int max = 0, min = 1000, total = 0;
            for(int i = 0; i < n; i++ ){
                score.add(scan.nextInt());
            }

            for(int i = 0;i < n ;i++){
                int a = score.get(i);
                max = Math.max(a, max);
                min = Math.min(a, min);
                total += a;
            }

            int ave = (total - (max + min)) / (n -2);

            System.out.println(ave);
            n = scan.nextInt();
        }
        scan.close();
    }
}