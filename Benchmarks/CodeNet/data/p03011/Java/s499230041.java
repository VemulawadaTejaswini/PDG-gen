
import java.util.Scanner;
import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
      
        int x[]=new int[3];
        int x2[]=new int[3];
        for (int i = 0; i < 3; i++) {
            x[i]=entrada.nextInt();
        }
        
        for (int i = 0; i < 2; i++) {
            x2[i]=x[i]+x[i+1];
        }
        x2[2]=x[0]+x[2];
        Arrays.sort(x2);
        System.out.println(x2[0]);
    }
    
}