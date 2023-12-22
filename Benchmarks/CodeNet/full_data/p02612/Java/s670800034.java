import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = n / 1000;
        if(n % 1000 != 0){
            x++;
        }
        System.out.println(x * 1000 - n);

    }
}
