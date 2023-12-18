import java.util.*;
 
 
class ex1 {
 
    public static void main (String args[])
    {
      Scanner in = new Scanner(System.in);
        
        int sh = in.nextInt();
        int w=in.nextInt();
        if(w>=sh)System.out.println("unsafe");
        else System.out.println("safe");
    }
}