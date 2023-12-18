import java.util.*;

class Main{
	public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      int A=in.nextInt();
      int B=in.nextInt();
      
      int res=0;
      int strip=1;
      while(strip<B){
      	strip=strip-1+A;
        res++;
      }
      System.out.println(res);
      in.close();
    }
}