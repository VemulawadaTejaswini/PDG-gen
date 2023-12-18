import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long sum = (long)Math.pow(10,9)+7;
		long all = 1;
		for(int i=1;i<=n;i++){
			all*=i;
			if(sum<all){
				all = 457992974;
				break;
			}
		}
		System.out.print(all);
	}
}
