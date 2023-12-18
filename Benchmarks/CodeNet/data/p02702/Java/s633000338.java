import java.util.*;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        int STD = 2019;

        int count = 0;
        String temp = Long.toString(a);
        for (int i = 0; i < temp.length(); i++) {
            for (int j = 0; j <  temp.length(); i++) {
                long num = Long.parseLong(temp.substring(i, j));
                if (num % STD == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}