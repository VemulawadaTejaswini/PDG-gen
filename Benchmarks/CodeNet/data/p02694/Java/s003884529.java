import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = 100;
		long b = sc.nextLong();
        int ans = 0;
        while(a<b){ans++;a+=a/100;
                            }
        
		System.out.println(ans);
	}
}
