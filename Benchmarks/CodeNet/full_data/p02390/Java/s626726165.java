import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
  
        int t = sc.nextInt();
        
        int h = t / 3600;
        int m = t % 3600 / 60;
        int s = t % 3600 % 60;
        
        System.out.println(h + ":" + m + ":" + s);
    }
}
