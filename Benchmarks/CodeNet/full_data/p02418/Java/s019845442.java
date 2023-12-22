
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.nextLine();
		String p = stdIn.nextLine();
		int y = -1;
		
		for(int i=0;i<p.length();i++){
			for(int j=0;j<s.length();j++){
				if(s.charAt(j) == p.charAt(i)){
					int x = i;
					y = func(s,p,i,j,x);
				}
				if(y==1){
					break;
				}
			}
			if(y==1){
				break;
			}
		}
		
		if(y==1){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
	}
	 static int func(String s ,String p ,int i ,int j ,int x){
		int p_count = (i+1)%p.length();
		int s_count = (j+1)%s.length();
		int ans = 0;
		if(s.charAt(s_count) == p.charAt(p_count)){
			if((p_count+1)%p.length() == x){
				ans = 1;
			}
			else{
				ans = func(s,p,p_count,s_count,x);
			}
		}
		else{
			ans = -1;
		}
		 
		 return ans;
	}

}