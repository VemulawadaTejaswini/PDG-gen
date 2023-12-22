import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true) {
            String num = sc.next();
            int i;
            int Sum = 0;
            for (i = 0; i <= (num.length() - 1); i++) {
                int x = ((num.charAt(i)) - '0');
                Sum += x;
            }
            if(Sum == 0) break;
            System.out.printf("%d\n", Sum);
        }
    }
}

