import java.util.Scanner;

class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		char[] moji = str.toCharArray();
		
		for(int i=0; i < moji.length; i++){
			if(moji[i] >= 'A' && moji[i] <= 'Z' ){
				moji[i] += 0x20;
			}
			else if(moji[i] >= 'a' && moji[i] <= 'z' ){
				moji[i] -= 0x20;
			}
			
		}
		

		System.out.println(moji);
		
	}
}
