import java.util.Scanner;

/**
 * 2018-04-08
 * https://beta.atcoder.jp/contests/abc069/tasks/abc069_b
 */

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String origin = sc.next();
        String first = origin.substring(0,1);
        String last = origin.substring(origin.length()-1);
        int num = origin.length()-2;
      
        System.out.println(first+num+last);


    }
}
