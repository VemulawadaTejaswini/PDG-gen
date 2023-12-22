import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();   
      	long ans = 0;
      	for(int i=1;i<=n;i++){
          long t = n / i;
          long l = i * t * ( t+1 ) / 2;
          ans += l;
        }
      	System.out.println(ans);
    }
}
