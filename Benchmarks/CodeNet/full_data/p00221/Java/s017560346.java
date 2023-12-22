import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int m = cin.nextInt();
			int n = cin.nextInt();
			if(n+m==0)break;
			boolean[] mem=new boolean[m];
			Arrays.fill(mem,true);
			int idx=-1,cnt=m;
			label:for(int i = 0;i<n;i++){
				for(int j = 0;j<m;j++){
					idx++;
					idx=idx%m;
					if(mem[idx%m]){
						break;
					}
				}
				
				int r=right(i+1);
				String s =cin.next();
				int g=0;
				if(Character.isDigit(s.charAt(0)))
					g=Integer.parseInt(s);
				else if(s.equals("Fizz")){
					g=-1;
				}
				else if(s.equals("Buzz")){
					g=-2;
				}
				else if(s.equals("FizzBuzz")){
					g=-3;
				}
				else{
					g=0;
				}
				//System.out.println(r+" "+cnt);
				if(r!=g){
					mem[idx]=false;
					cnt--;
					if(cnt==0){
						break;
					}
				}
			}
			boolean first=true;
			for(int i = 0;i<mem.length;i++){
				if(mem[i]){
					if(first){
						System.out.print(i+1);
						first=false;
					}
					else{
						System.out.print(" "+(i+1));
					}
				}
			}
			System.out.println();
			
		}
		
	}
	static int right(int a){
		if(a%15==0)
			return -3;
		else if(a%5==0){
			return -2;
		}
		else if(a%3==0){
			return -1;
		}
		return a;
	}
}