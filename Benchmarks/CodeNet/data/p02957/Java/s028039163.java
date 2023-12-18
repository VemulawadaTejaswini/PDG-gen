import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        
        if(A == 0 || B == 0)
        {
            System.out.println("IMPOSSIBLE");
        }
        
        if(A > B)
        {
            for(int i=B; i<=A; i++)
            {
                int sumA = A-i;
                int sumB = B-i;
                if(sumB < 0)
                {
                    sumB*=-1;                    
                }
                if(sumA == sumB)
                    {
                        System.out.println(i);
                        break;
                        
                    }
                
                
            }
        }
        else 
        {
            for(int i=A; i<=B; i++)
            {
                int sumA = A-i;
                int sumB = B-i;
                if(sumA < 0)
                {
                    sumA*=-1;                    
                }
                if(sumB == sumA)
                    {
                        System.out.println(i);
                        break;
                        
                    }
                
                
            }
            
        }
        
        
    }
    
    
}
