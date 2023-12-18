import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		String s=stdIn.next();
		String t=stdIn.next();
		int S[]=new int[26];
		int T[]=new int[26];
		boolean fin=false;
		int z=0,max=0;
		char key=' ';
		int i=0;
		while(z<s.length()){
			char a=s.charAt(z);
			S[a-'a']++;
			z++;
		}z=0;
		while(z<t.length()){
			char a=t.charAt(z);
			T[a-'a']++;
			z++;
		}z=0;
		while(z<26){
			if(T[z]!=0&&S[z]==0)
				fin=true;
			else
				if(T[z]!=0&&S[z]!=0){
					int a=T[z]/S[z];
					if(T[z]%S[z]!=0)
						a++;
					if(max<a){
						max=a;
						i=a*S[z]-T[z];
						if(i==0)
							i=S[z];
						key=(char)((char)z+'a');
					}
				}
			z++;
		}z=0;
		if(fin)
			System.out.println(-1);
		else{
			while(z<s.length()){
				char a=s.charAt(z);
				if(a==key)
					i--;
				if(i==0)
					break;
				z++;
			}
			System.out.println(max*s.length()+z+1);
		}
	}
}