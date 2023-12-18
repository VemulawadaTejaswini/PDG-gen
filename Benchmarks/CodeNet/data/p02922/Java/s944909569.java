import java.util.*;

class Main{
	public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      int A=in.nextInt();
      int B=in.nextInt();
      
      int res=1;
      int strip=A;
      while(strip<B){
      	strip=strip-1+A;
        res++;
      }
      System.out.println(res);
      in.close();
    }
}