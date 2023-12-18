import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

       int N  = scanner.nextInt();
       int oldt = 0;
       int oldx = 0;
       int oldy = 0;
       int flag = 1;
        for (int i = 0; i < N; i++) {
            int t = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int sat = t - oldt;

            int saxy = Math.abs(oldx - x) + Math.abs(oldy - y);

            if(sat < saxy)flag = 0;

            if(sat % 2 == saxy % 2){

            }else{
                flag = 0;
            }

        }

        if(flag == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }


}

