import java.util.Scanner;
public class Main{
	static String number;
	static long ans;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		number = sc.next();
		ans=0;
		System.out.println(dfs(0,1,0));
	}
	public static long dfs(int start,int last,long sum){
		long num =  Long.parseLong(number.substring(start, last));
		if(last==number.length()){
			
			return sum+num;
		}
		 return dfs(start,last+1,sum)+dfs(last,last+1,sum+num);
		 
		
		
	}
}