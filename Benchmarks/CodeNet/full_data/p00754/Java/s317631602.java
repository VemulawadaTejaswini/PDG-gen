
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		char ch[],kako[];
		while(true){
			str=sc.nextLine();
			if(str.equals(".")) break;
			ch=str.toCharArray();
			kako=new char[ch.length];

			boolean flag=true;
			int k=0;
			for(int i=0;i<ch.length;i++){
				if(ch[i]=='('){
					kako[k]='(';
					k++;
				}
				if(ch[i]==')'){
					if(k>0 && kako[k-1]=='('){
						k--;
					}
					else{
						flag=false;
						break;
					}
				}
				if(ch[i]=='['){
					kako[k]='[';
					k++;
				}
				if(ch[i]==']'){
					if(k>0 && kako[k-1]=='['){
						k--;
					}
					else{
						flag=false;
						break;
					}
				}
			}
			if(flag)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}