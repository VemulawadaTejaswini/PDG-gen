import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		try{
			for(int i=0;i<n;i++){
				long a=sc.nextLong();
				long b=sc.nextLong();
				long ans=a+b;
				System.out.println(ans);
			}
			sc.close();
		}catch(Exception e){
			System.out.println("overflow");
		}
	}
}