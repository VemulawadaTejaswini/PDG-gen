import java.util.Scanner;
class Main {

    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt() , b = x.nextInt();
        int c = a*b;
        int d = 2*a + 2*b;
        System.out.println(c + " " + d);
    }
    
}