import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = 0;
        for(int i = a; i<=b; i++) {
            String s1 = Integer.toString(i);
            String s2 = new StringBuilder(s1).reverse().toString();
            if(s1.equals(s2)) res++;
        }

        System.out.println(res);
    }

}
