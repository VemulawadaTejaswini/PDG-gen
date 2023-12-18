import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double ans=0;
		for(int i = 0; i<n; i++){
			double x=sc.nextDouble();
			String s = sc.next();
			if(s.equals("JPY")){
				ans+=x;
			}else{
				ans+=x*380000;
			}
		}
		System.out.println(ans);
	}
}