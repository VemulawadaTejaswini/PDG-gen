import java.util.Scanner;
public class Main{
	    int a,b,sa;
		
		public void solve(){
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<8;i++){
					a=sc.nextInt();
					b=sc.nextInt();
					sa=a-b;
					System.out.println(sa);
					}
		}
		public static void main(String[]args){
			Main obj=new Main();
			obj.solve();
		}
}