
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
					int count = 1;
					y = func(s,p,i,j,x,count);
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
	 static int func(String s ,String p ,int i ,int j ,int x,int count){
		int p_count = (i+1)%p.length();
		int s_count = (j+1)%s.length();
		int ans = 0;
		
		if(count == p.length()){
			ans = 1;
		}
		else if(s.charAt(s_count) == p.charAt(p_count)){
				count++;
				ans = func(s,p,p_count,s_count,x,count);
			}
		else{
			ans = -1;
		}
		 
		 return ans;
	}

}