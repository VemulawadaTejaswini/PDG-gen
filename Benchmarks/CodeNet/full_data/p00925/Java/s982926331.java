import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		String exp = sc.next();
		calc(exp);
	}
	public void calc(String exp){
		int ans1 = 0;
		int ans2 = Integer.parseInt(exp.substring(0,1));
		
		int temp = ans2;
		
		for(int i = 0; i < exp.length() / 2; i++){
			String e = exp.substring(2*i+1, 2*i+2);
			int k = Integer.parseInt(exp.substring(2*i+2, 2*i+3));
			
			if(e.equals("+")){
				ans2 += k;
				
				ans1 += temp;
				temp = k;
			}
			else{
				ans2 *= k;
				
				temp*= k;
			}
		}
		ans1 += temp;
		
		int bob_ans = sc.nextInt();
		String output = "";
		
		if(bob_ans == ans1){
			if(bob_ans == ans2) output = "U";
			else output = "M";
		}
		else if(bob_ans == ans2) output = "L";
		else output = "I";
		
		System.out.println(output);
		
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}