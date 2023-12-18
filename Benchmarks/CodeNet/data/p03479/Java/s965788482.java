import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long x = sc.nextLong();
      long y = sc.nextLong();
      double n = 1;
      while(true){
      	if((n-1)*Math.log10(2)+Math.log10(x)>Math.log10(y)){
        	n--;
            break;
        }
        n++;
      }
      System.out.println(n);
    }
}
