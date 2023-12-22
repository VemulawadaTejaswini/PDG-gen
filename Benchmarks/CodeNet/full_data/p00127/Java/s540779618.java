import java.util.Scanner;

public class Main {

	static char[][] table = new char[6][7];
	static{
		int cnt=0;
		for(int i = 1;i<7;i++){
			for(int j =1;j<6;j++){
				table[j][i]=(char)('a'+cnt++);
			}
		}
		table[2][6]='.';
		table[3][6]='?';
		table[4][6]='!';
		table[5][6]=' ';
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		label:while(cin.hasNext()){
			String str = cin.next();
			if(str.length()%2!=0){
				System.out.println("NA");
				continue;
			}
			String ans = "";
			for(int i = 0;i<str.length();i+=2){
				int a = str.charAt(i)-'0';
				int b = str.charAt(i+1)-'0';
				//System.out.println(a + ""+ b);
				if(b < 1 || b > 5 || a < 1 || a > 6){
					System.out.println("NA");
					continue label;
				}
				else{
					ans += table[b][a];
				}
			}
			System.out.println(ans);
		}
	}

}