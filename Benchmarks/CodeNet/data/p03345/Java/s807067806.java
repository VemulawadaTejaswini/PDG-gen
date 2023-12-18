import java.util.Scanner;

/**
 *
 * @author Suraj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =  new Scanner(System.in);
        long A=in.nextLong();
        long B=in.nextLong();
        long C=in.nextLong();
        long K=in.nextLong();
        double x = Math.pow(10,18);
        long a,b,c;
        if(K%2==2){
            if(A-B>x){
                System.out.println("Unfair");
            }
            else{
                System.out.println(A-B);
            }
        }
        else{
            if(B-A>x){
                System.out.println("Unfair");
            }
            else{
                System.out.println(B-A);
            }
        }
        
        
        
    }
    
}
