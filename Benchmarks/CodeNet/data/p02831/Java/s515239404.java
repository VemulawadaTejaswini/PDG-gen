import java.util.*;
class Main{
  public static void main(String[]args){
   	  Scanner in = new Scanner(System.in);
      int x = in.nextInt(), y = in.nextInt(), i = 2, p = 1, a = 0, b = 0;
      while(x!=1||y!=1){
      	if(x%i==0) x/=i;
        if(y%i==0) y/=i;
        if(a!=x||b!=y) p *= i;
        if(x%i!=0&&y%i!=0) i++;a = x; b = y;
      }
    	System.out.println(p);
   }
}