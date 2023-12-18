import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int d = stdIn.nextInt();

        int ab = a - b;
        int bc = b - c;
        int ca = c - a;
        
        if(ab < 0)
            ab = b - a;
        if(bc < 0)
            bc = c - b;
        if(ca < 0)
            ca = a - c;
        
        if(ca <= d)
            System.out.println("Yes");
        else if(ab <= d || bc <= d)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}