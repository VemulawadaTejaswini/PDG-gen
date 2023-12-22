//問題１　2704 上石彩花
imoort java.util.Scanner;
public class Main{
	
	public void solve(){
		Scanner sc=new Scanner(System.in);
		int a,b,sa;
		for(int i=0;i<7;i++){
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println(a-b);
		}
	}
	
	public static void main(String[]arges){
		Main obj=new Main();
		obj.solve();
	}