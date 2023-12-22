import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc = new Scanner(System.in);
		int c[]=new int[26];
		while(true){
			String str = sc.nextLine();
			if(str==null)break;
			for(int i=0;i<str.length();i++){
				char a='a';
				for(int j=0;j<26;j++){
					if(a==Character.toLowerCase(str.charAt(i))){
						c[j]++;
					}
					a++;
				}
			}
		}
		for(int i=0;i<26;i++){
			System.out.println((char)('a'+i)+" : "+c[i]);
		}
	}
}