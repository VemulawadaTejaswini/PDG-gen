import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        scan.close();
        System.out.println(a+a*a+a*a*a);
    }
}