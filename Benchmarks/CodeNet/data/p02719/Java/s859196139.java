import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		long N_absolute=Math.abs(sc.nextLong());
		long K_absolute=Math.abs(sc.nextLong());
		long result=N_absolute;
		

		while(result>0) {
			result=result-K_absolute;
		}
		
		if(N_absolute>Math.abs(result)) {
			System.out.println(Math.abs(result));
		}else {
			System.out.println(N_absolute);
		}
	}
}