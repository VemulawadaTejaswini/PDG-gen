import java.util.Scanner;
    
class Main {    
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        double b = in.nextDouble();
        long ans = 1;
        ans = (long)(b*a);

        System.out.println(ans);
    }
}