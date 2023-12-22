import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();

        int re = (int)(d/s+(double)(s-1)/s);

        if(re>t){
          System.out.println("No");
        }else{
            System.out.println("Yes");
        }


    }
}