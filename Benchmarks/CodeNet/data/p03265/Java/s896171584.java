package problemsolving;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        
        int d1 =  x2-x1 ;
        int d2 =  y2 - y1;
        
        int p1 = x2-d2 ;
        int p2 = y2 +d1 ;
        int p3 = x1-d2 ; 
        int p4 = y1 + d1 ;
        System.out.print(p1+" "+p2+" "+p3+" "+p4);
    }
}
