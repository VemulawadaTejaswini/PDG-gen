import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] ans = new int[20000];
		int cnt = 0;
		
		while(true){
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			
			if(op.equals("?"))
				break;
			
			if(op.equals("+"))
				ans[cnt] = a + b;
			else if(op.equals("-"))
				ans[cnt] = a - b;
			else if(op.equals("*"))
				ans[cnt] = a * b;
			else
				ans[cnt] = a / b;
			
			cnt ++;
		}
		
		for(int i = 0; i < cnt; i++){
			System.out.println(ans[i]);
		}
	}
}