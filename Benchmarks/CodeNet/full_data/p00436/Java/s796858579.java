import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		static int n = stdIn.nextInt();
		static int[] cardSet = cardSet[2*n];
		
		for(int i=0;i<n*2;i++){
			cardSet[i] = i+1;
		}
		int m = stdIn.nextInt();
		for(i=0;i<m;i++){
			int shuffle = stdIn.nextInt();
			if(shuffle != 0){
				hinduShuffle(shuffle);
			}else{
				riffleShuffle();
			}
		}
		for(i=0;i<cardSet.length;i++){
			System.out.println(cardSet[i]);
		}
	}
	public static void hinduShuffle(int shufflePosition){
		int temp[] = new Integer[shufflePosition];
		for(int i=0;i<shufflePosition;i++){
			temp[i] = cardSet[i];
		}
		int shufflePositionTemp = shufflePosition;
		for(i=0;i<cardSet.length-shufflePosition;i++){
			cardSet[i] = cardSet[shufflePositionTemp];
			shufflePositionTemp++;
		}
	}
	public static void riffleShuffle(){
		int[] cardSetCopy = (Integer[])cardSet.clone();
		for(int i=1;i<n;i++){
			cardSet[i*2] = cardSet[i];
		}
		int x = 0;
		for(int j=1;j<2*n;j+=2){
			cardSet[j] = cardSetCopy[n+x];
			x++;
		}
	}
}