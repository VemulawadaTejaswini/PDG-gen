
import java.util.Scanner;


public class Frog1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int n = input.nextInt();
        
        int [] array1 = new int [n];
        
        for(int i = 0 ; i < n ; i++)
            array1[i] = input.nextInt();
        
        int [] array2 = new int [n];
        
        array2[0] = 0;
        array2[1] = Math.abs(array1[0] - array1[1]);
        
        for(int i = 2 ; i < n ; i++)
        {
            int temp1 = Math.abs(array1[i-1] - array1[i]) + array2[i-1];
            int temp2 = Math.abs(array1[i-2] - array1[i]) + array2[i-2];
            
            array2[i] = Math.min(temp1 , temp2);
        }
        
        System.out.println(array2[n-1]);
    }
        
        
    
}
