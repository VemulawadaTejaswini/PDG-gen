import java.util.*;
public class Main {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    String n = String.valueOf(N);
	    char a[] = n.toCharArray();
	    char b = a[0];
	    char c[] = {b,b,b};
	    int ans = Integer.parseInt(String.valueOf(c));
	    if(ans >= N){
	      System.out.println(ans);
	    }else{
	      ans += 111;
	      System.out.println(ans);
	    }
	    sc.close();
	  }
}