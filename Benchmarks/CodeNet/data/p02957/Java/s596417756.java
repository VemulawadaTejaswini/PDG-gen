import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner  input = new Scanner(System.in);
        
        int A = input.nextInt();
        int B = input.nextInt();
        
        int count = 0; int i ;
        if(A>B){
        
            for ( i = 0; i <= A; i++) {
                int x= Math.abs(A - i);
                int y = Math.abs(B - i);
                Math.abs(x);
                Math.abs(y);
                System.out.println(x+" "+y);
                if (x == y){
                count ++;
                break;
                }
            }
            if (count > 0 ){
            System.out.println(i); }
            else{
                System.out.println("IMPOSSIBLE");
            }
        }
        count=0;
        if(A<B){
        
            for ( i = 0; i <= B; i++) {
                int x= Math.abs(A - i);
                int y = Math.abs(B-i);
                if (x ==y){
                count ++;
                break;
                }
            }
            if (count > 0 ){
            System.out.println(i); }
            else{
                System.out.println("IMPOSSIBLE");
            }
        }
        
    }
}