import java.util.Scanner;

public class Main{
	static int n = 0;
	static Integer[] cardSet = null;

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		n = stdIn.nextInt();
		cardSet = new Integer[2*n];

		for(int i=0;i<n*2;i++){
			cardSet[i] = i+1;
		}
		int m = stdIn.nextInt();
		for(int i=0;i<m;i++){
			int shuffle = stdIn.nextInt();
			if(shuffle != 0){
				hinduShuffle(shuffle);
			}else{
				riffleShuffle();
			}
		}
		for(int i=0;i<cardSet.length;i++){
			System.out.println(cardSet[i]);
		}
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++
	//ヒンズーシャッフル
	//++++++++++++++++++++++++++++++++++++++++++++++++++++
	public static void hinduShuffle(int shufflePosition){
		Integer[] cardSetCopy = (Integer[])cardSet.clone();
		int i = 0;
		for(;i<cardSet.length-shufflePosition;i++){
			cardSet[i] = cardSetCopy[i+shufflePosition];
		}
		for(int j=0;j<shufflePosition;j++,i++){
			cardSet[i] = cardSetCopy[j];
		}
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++
	//リフルシャッフル
	//++++++++++++++++++++++++++++++++++++++++++++++++++++
	public static void riffleShuffle(){
		Integer[] cardSetCopy = (Integer[])cardSet.clone();
		int x=1;
		for(int i=2;i<cardSet.length;i+=2){
			cardSet[i] = cardSetCopy[x];
			x++;
		}
		for(int i=1;i<cardSet.length;i+=2){
			cardSet[i] = cardSetCopy[x];
			x++;
		}
	}
}