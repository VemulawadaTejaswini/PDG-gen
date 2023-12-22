import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        long y = sc.nextInt();
        double dx = (double) x;
        double dy = (double) y;
        System.out.println(x/y+" "+x%y+" "+dx/dy);
    }
}