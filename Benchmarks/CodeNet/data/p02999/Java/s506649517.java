import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        //String[] a = sc.nextLine().split(" ");

        int x = Integer.parseInt(s1[0]);
        int a = Integer.parseInt(s1[1]);

        int result=0;
        if (x < a) {
        	result=0;
        } else {
        	result=10;
        }

        System.out.println(result);
    }



}