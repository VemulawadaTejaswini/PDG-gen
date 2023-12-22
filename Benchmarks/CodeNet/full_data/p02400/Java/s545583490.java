import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double pi = 3.14;
        System.out.println(x*x*pi+" "+(x+x)*pi);
    }
}