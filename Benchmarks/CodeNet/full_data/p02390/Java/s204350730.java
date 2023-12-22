import java.util.Scanner;

public class Main{
	
	int S;
	int hour;
	int min;
	int seco;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		S =sc.nextInt();
		
		hour = S / 3600;
		min = (S - hour*3600) / 60;
		seco= (S - hour*3600) - (min*60);
		
		System.out.println(hour+":"+min+":"+seco);
		
	}
	
	public static void main(String[]args){
		Main obj = new Main();
		obj.solve();
	}
}