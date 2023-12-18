import java.util.*;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        final int n = sc.nextInt();

        int number[] = new int[n];
        boolean res = false;
        point:for (int i = 0; i < number.length; i++) {
            int num = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if(num == number[j]){
                    res = true;
                    System.out.println("NO");
                    break point;
                }
                number[i] = num;
            }
        }
        if(!res)
            System.out.println("YES");
        sc.close();
    }
}