
import java.util.Scanner;

/**
 *
 * @author AHSAN HABIB
 */
class Factorial {

    /**
     * @param args the command line arguments
     */
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        int f=sc.nextInt();
        int k=factorial(f);
        System.out.println(k);
    }
    
    public static int factorial(int i){
        if(i==0||i==1){
            return 1;
        }
        if(i==2){
            return 2;
        }
        int f=1;
        while(i>1){
            f*=i;
            --i;
        }
        
        return f;
    }
    
}