
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       if(a>0&&a<10000&&b>0&&b<10000){
        if(a*b%2==0){
            System.out.println("Even");
            System.out.println("As "+a+"×"+b+"="+a*b+" is even, print Even.");
        }
        else{
            System.out.println("Odd");
            System.out.println("As "+a+"×"+b+"="+a*b+" is odd, print Odd.");
        }
    }
        else{
            return;
        }

        }
        
    }
    

