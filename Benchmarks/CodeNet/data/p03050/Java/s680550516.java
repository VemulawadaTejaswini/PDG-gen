import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans=0;
		ans+=n-1;
		long count=2;
		while(true){
			if((n-count)%count==0){
				if((n-count)/count<=count){
					break;
				}
				ans+=(n-count)/count;
			}
			count++;
			
		}
		System.out.println(ans);
	}
}
