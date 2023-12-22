import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      long x=1;
      for(int i=0;i<N;i++){
      	long a=sc.nextLong();
       x=x*a;
      }
      String y=String.valueOf(x);
      String z=y.replaceAll("0","");
      if(y.length()>=19 && !(z=="1")){
      	System.out.println(-1);
      }else{
      	System.out.println(y);
      }
	}
}