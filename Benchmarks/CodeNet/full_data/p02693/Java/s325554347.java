import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y =  ( double )x/100;
        double n = Math.log( y ) / Math.log(1.01);
 
        System.out.println( Math.ceil(n) );

    }
}