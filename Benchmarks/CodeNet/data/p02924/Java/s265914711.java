import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	long N = sc.nextLong(); //1 <= N <= 10^9
	long cnt = 0;
	for(long i=N-1;i>0;i--){
     	 cnt += i;
    }
  	System.out.println(cnt);                           
}
}