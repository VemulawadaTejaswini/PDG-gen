import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = x + a;

        if( p > b ){
        	System.out.println("delicious");
        }else if( p == b ){
        	System.out.println("safe");
        }else if( p < b ){
        	System.out.println("dangerous");
        }
        }
}