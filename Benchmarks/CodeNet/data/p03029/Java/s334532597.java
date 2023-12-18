import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        
        int A=sc.nextInt();
        int P=sc.nextInt();
        
        int max=(A*3+P)/2;
        
        
        System.out.println(max);
        sc.close(); 
    }
}