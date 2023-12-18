import java.util.Scanner;

class A {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int a = sc.nextInt();

        if(h%a==0)
            System.out.println(h/a);
        else
            System.out.println((h/a)+1);
    }
}
