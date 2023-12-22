//2704 ??????????????± 1_1_D
import java.util.Scanner;
public class Main{
	int S,h,m,s;
	
	public void solve(){
		Scanner sc=new Scanner(System.in);
		S=sc.nextInt();
		
			h=S/3600;
			m=(S-3600*h)/60;
			s=(S-3600*h-60*m);
			
			System.out.println(h+":"+m+":"+s);
			
	}
	public static void main(String[]args){
		Main obj=new Main();
		obj.solve();
	}
}