import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean a = sc.next().equals("H") ? true : false;
        boolean b = sc.next().equals("H") ? true : false;
        if(a==b)
        System.out.println("H");
        else
        System.out.println("D");
    }
}