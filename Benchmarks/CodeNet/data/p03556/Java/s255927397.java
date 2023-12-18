import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sn = Math.sqrt(n);
      if(n == sn*sn){
      	System.out.println(n);
      }else{
      	System.out.println(sn*sn);
      }
    }
}