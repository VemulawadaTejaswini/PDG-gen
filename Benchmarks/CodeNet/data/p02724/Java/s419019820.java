import java.util.*;
import java.math.*;

class Main{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   long x = sc.nextInt();
   long ret = 1000*(x/500);
   x %= 500;
   ret += 5*(x/5);
   System.out.println(ret); 
}
}
