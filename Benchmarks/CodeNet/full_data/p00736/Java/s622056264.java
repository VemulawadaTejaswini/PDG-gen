import java.util.Scanner;

public class Main {
	char[] s;//原文
	int index;//今なん文字目か
	int[] table;//PQRの値
	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			String str=sc.next();
			if(str.equals(".")) break;
			//s=(str+"$").toCharArray();
			s=str.toCharArray();
			table=new int[3];
			int ans=0;
			for(int p=0; p<3; p++){
				table[0]=p;
				for(int q=0; q<3; q++){
					table[1]=q;
					for(int r=0; r<3; r++){
						table[2]=r;
						index=0;
						if(formura()==2) ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
	int formura(){
		int r=term();
		while(index < s.length){
			char c = c();
			if(c == '*'){
				int a = term();
				r = Math.min(r, a);
			}
			else if(c == '+'){
				int a = term();
				r = Math.max(r, a);
			}
			else break;
		}
		return r;
	}
	int term(){
		char c=c();
		if(c=='('){
			int r=formura();
			return r;
		}
		if(c=='-'){
			int r=term();
			if(r==2){
				return 0;
			}
			else if(r==1){
				return 1;
			}
			else if(r==0){
				return 2;
			}
		}
		if(Character.isDigit(c)) return c-'0';
		if(c=='P'){
			return table[0];
		}
		else if(c=='Q'){
			return table[1];
		}
		else if(c=='R'){
			return table[2];
		}
		return -1;
	}
	char c(){
		return s[index++];
	}
}