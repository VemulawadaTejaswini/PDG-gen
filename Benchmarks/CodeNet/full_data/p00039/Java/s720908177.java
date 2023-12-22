import java.util.Scanner;

public class Main {

	static int I=1, V=5, X=10, L=50, C=100, D=500, M=1000;
	static char[] s;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String str = cin.next();
			s = new char[150];
			for(int i = 0; i < str.length(); i++){
				s[i]=str.charAt(i);
			}
			int sum=0;
			for(int i = 0; i < str.length(); i++){
				int now= charToInt(s[i]);
				int next = charToInt(s[i+1]);
				if(now < next){
					sum+=next-now;
					i++;
				}
				else{
					sum+=now;
				}
			}
			System.out.println(sum);
		}
		
	}
	static int charToInt(char s){
		int now=0;
		if(s=='I'){
			now=I;
		}
		else if(s=='V'){
			now=V;
		}
		else if(s=='X'){
			now=X;
		}
		else if(s=='L'){
			now=L;
		}
		else if(s=='C'){
			now=C;
		}
		else if(s=='D'){
			now=D;
		}
		else if(s=='M'){
			now=M;
		}
		else{
			
		}		
		return now;
	}
}