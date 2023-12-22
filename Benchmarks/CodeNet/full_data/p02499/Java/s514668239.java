import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int[] num =new int[26];
			while(scan.hasNext()){
				String str =scan.nextLine().toLowerCase();
				for(int i = 0; i < str.length();i++){
					char c = str.charAt(i);
					if(Character.isLowerCase(c)){
						num[(int)c - (int)'a']++;
					}
				}
			}
			for(int i = 0; i < num.length;i++){
				char c = (char) ('a' + i);
				System.out.printf("%c : %d\n",c,num[i]);
			}
		}finally{
			scan.close();
		}
	}
}