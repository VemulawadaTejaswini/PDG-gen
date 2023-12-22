import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int sumB = 0;
        int cnt = 0;

        while(sc.hasNextLine()){
            String[] s = sc.nextLine().split(",");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            sum += a * b;
            sumB += b;
            cnt++;
        }

        System.out.println(sum);
        System.out.println((int)Math.round((double)sumB / cnt));
    }
}