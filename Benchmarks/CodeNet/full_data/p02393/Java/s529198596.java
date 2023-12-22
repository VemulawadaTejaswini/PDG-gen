import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        
        
        do {
            if (a > b) {
                int n = a;
                a = b;
                b = n;
            } else if (b > c) {
                int m = b;
                b = c;
                c = m;
            }
            } while(!(a<b && b<c));
            
            System.out.println(a+" "+b+" "+c);
    }
}