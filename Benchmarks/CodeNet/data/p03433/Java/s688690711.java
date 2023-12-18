
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        if(n<500&&n<a){
            System.out.println("Yes");
        }
        else if(n>500){
            if(n%500<a){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else if(n>a&&n<500){
            System.out.println("No");
        }
    }
    
}
