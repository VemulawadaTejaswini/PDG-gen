import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String line=scanner.nextLine();
		char[] text=line.toCharArray();
		int[] ans=new int[26];
		for(char c:text){
			for(int i=0;i<26;i++){
				char a=(char) (65+i);
				char b=(char) (a+32);
				if(a==c||b==c){
					ans[i]++;
				}
			}
		}

		for(int i=0;i<ans.length;i++){
			char a=(char) (97+i);
			System.out.println(a+" : "+ans[i]);
		}
	}
}