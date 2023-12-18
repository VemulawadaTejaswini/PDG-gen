import java.util.*;
import java.math.*;
public class Main{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int z;
        z=input.nextInt();
        for(int i=z;i>=1;i--)
            if(i%Math.sqrt(i)==0)
            {
                System.out.println(i);
                break;
            }
        
    }
    
}
