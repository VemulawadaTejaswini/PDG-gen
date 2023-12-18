import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	int N = sc.nextInt(); //1 <= N <= 10^9
	int cnt = 0;
	for(int i=N-1;i>0;i--){
     	 cnt += i;
    }
  	System.out.println(cnt);                           
}
}