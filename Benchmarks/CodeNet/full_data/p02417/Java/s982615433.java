import java.util.Scanner;

public class Main{	
	public static void main(String[] arts){
		Scanner sc = new Scanner(System.in);
		char[] alpha = new char[26];
		for(int i=0;i<26;i++){
			alpha[i]=(char)(97+i);
		}
		int[] list = new int[26];
		while(sc.hasNext()){
			String s = sc.nextLine();
			for(int i=0;i<s.length();i++){
				int c = s.toLowerCase().codePointAt(i);
				if(c>=97 && c<=122)
					list[c-97]++;
			}
		}
		for(int i=0;i<26;i++){
				System.out.printf("%c : %d\n",alpha[i],list[i]);
		}
	}
}
