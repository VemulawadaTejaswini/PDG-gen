import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		ArrayList<String> dic = new ArrayList<String>();
		int amount =scan.nextInt();
		String[] decree = new String[amount];
		String[] word = new String[amount];
		
		for(int i=0; i<amount; i++){
			decree[i] = scan.next();
			word[i] = scan.next();
			}
		
		for(int i=0; i<amount; i++){
			int value = 0;
			if(decree[i].equals("insert")){
				dic.add(word[i]);
			}
			else if(decree[i].equals("find")){
				value = dic.indexOf(word[i]);
				if(value == -1){
					System.out.println("no");
				}
				else{
					System.out.println("yes");
				}
			}
		}

	}
}