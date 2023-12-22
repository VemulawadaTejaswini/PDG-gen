import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i ++){
            if ((c % i) == 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
