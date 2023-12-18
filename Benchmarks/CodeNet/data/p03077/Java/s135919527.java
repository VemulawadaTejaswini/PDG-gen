import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = sc.nextLong();
        long f = Math.min(a,Math.min(b,Math.min(c,Math.min(d,e))));
        if(n%f==0){System.out.println(4+n/f);}
        else{System.out.println(5+n/f);}		
  }
}
