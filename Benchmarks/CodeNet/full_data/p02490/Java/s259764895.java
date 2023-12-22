import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int a;
        int b;
        int y = 1;
        
        while (y == 1){
            
            a = s.nextInt();
            b = s.nextInt();
            
            if( a > b ){
                System.out.print(b +" "+ a);
            } else if (a < b){
                System.out.print(a +" "+ b);
            } else if (a == b){
                if ( a != 0){
                    System.out.print(a+" "+b);
                } else {
                    y = 0;
                }
            }
        }
        
    }
}