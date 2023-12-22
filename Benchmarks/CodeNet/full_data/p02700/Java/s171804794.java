import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int x = ( a+d-1 ) / d;
        int y = ( c+b-1 ) / b;

        if( x>=y ){
            System.out.println('Yes');
        }else{
            System.out.println('No');
        }

    }
}