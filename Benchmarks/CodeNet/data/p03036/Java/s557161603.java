import java.util.Scanner;

public class Main{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();
        
        int previous = x;
        for (int index=0; index<10; index++){
            previous = r*previous-D;
            System.out.println(previous);
        }
    }
}