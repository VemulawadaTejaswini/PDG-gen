import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("数値を入力:");
		boolean flag = false;
		int ans = 0;
		while(flag == false){
			int in = s.nextInt();
			if(in <=10 && in >=1){
				ans = in+(int)Math.pow(in,2)+(int)Math.pow(in,3);
				System.out.print(ans);
				flag = true;
			}else{
				System.out.print("1~10の間で入力");
			}
		}
	}
}