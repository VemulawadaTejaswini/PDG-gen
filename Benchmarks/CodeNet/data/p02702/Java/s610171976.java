import java.util.Scanner;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int STD = 2019;

        int count = 0;
        for (int i = 0; i < a.length() -1; i++) {
            for (int j = a.length(); i < j; j--) {
                long num = Long.parseLong(a.substring(i, j));
                if (num % STD == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}