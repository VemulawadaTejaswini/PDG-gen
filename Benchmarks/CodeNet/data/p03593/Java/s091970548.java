import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main{
	static Scanner sc;

	static int[] wordNum;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;
		//PrintStream out = new PrintStream("src/output.txt");

		//System.setOut(out);

		sc = new Scanner(in);

		wordNum = new int['z'+1];
		int H = sc.nextInt();
		int W = sc.nextInt();

		for(int i = 0; i < H; i++){
			String temp = sc.next();
			for(int j = 0; j < W; j++){
				wordNum[temp.charAt(j)] += 1;
			}
		}

		int wordCount = 0;
		int odd = 0;
		int two = 0;
		int four = 0;
		for(int i = 'a'; i <= 'z'; i++){
			if(wordNum[i] != 0){
				wordCount++;
				//System.out.println(wordNum[i]);

				four += (int)(wordNum[i] / 4);
				two += (int)(wordNum[i] / 2) - (int)(wordNum[i] / 4)*2;
				if(wordNum[i] % 2 == 1){
					odd++;
				}
			}
		}

		int fourNum = (int)(H/2) * (int)(W/2);
		int twoNum  = (int)((H*W - (fourNum*4)) / 2);
		int oddNum  = (H*W)%2;
		//System.out.println(fourNum +"\t"+ twoNum +"\t"+  oddNum + "\t" + four);

		boolean yes = true;
		if(odd >= 2){
			yes = false;
		}else{
			if(four >= fourNum && odd == oddNum){
				yes = true;
			}else{
				yes = false;
			}
		}



/*
		if(odd >= 2){
			yes = false;
		}else if(odd == 1 && H*W%2 == 1 || odd == 0 && H*W%2 == 0){
			yes = true;
		}
*/
		/*
		int[] countDict = new int[wordCount];
		int count = 0;
		for(int i = 'a'; i < 'z'; i++){
			if(wordNum[i] != 0){
				countDict[count] = wordNum[i];
				count++;
			}
		}
		*/
		if(yes){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}


	}
}