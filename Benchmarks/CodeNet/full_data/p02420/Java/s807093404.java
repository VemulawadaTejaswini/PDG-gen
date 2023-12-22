import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		Scanner scan = new Scanner(System.in);
		String word = "";		//???????????????string
		int[] shuffleBegin = new int[100]; //?????£?????????????§????
		String temp = "";
		while(true){
			temp = scan.next();
			if(temp.equals("-")){
				break;
			}
			char[] targetChar = temp.toCharArray();
			int targetLength = temp.length();
			
			int shuffleTimes = scan.nextInt();
			for(int i=0; i<shuffleTimes; i++){
				shuffleBegin[i] = scan.nextInt();
			}
			
			for(int i =0;i<shuffleTimes; i++){
			word = "";
				for(int j=0; j<(targetLength - shuffleBegin[i]) ; j++){
					word = word + targetChar[j + shuffleBegin[i]];
				}
				
				for(int j=0; j<shuffleBegin[i]; j++){
					word = word + targetChar[j];
				}
				
			targetChar = word.toCharArray();

			}
			System.out.println(word);		
			
		}
	}
}