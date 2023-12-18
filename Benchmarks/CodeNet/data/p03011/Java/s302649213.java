
import java.util.Scanner;
import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
      int count=0;
        int x[]=new int[3];
        int x2[]=new int[3];
        
        for (int i = 0; i < 3; i++) {
            x[i]=entrada.nextInt();
        }
        for (int i = 0; i <2; i++) {
          for (int j = i+1; j<3; j++) {
            x2[count]=x[i]+x[j];
     count++;
          }
          
        }
     
      
        Arrays.sort(x2);
        System.out.println(x2[0]);
    }
    
}
