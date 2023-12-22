	import java.util.Scanner;

	class Main{
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
		public static void hinduShuffle(int shufflePosition){
			Integer temp[] = new Integer[shufflePosition];
			for(int i=0;i<shufflePosition;i++){
				temp[i] = cardSet[i];
			}
			int shufflePositionTemp = shufflePosition;
			for(int i=0;i<cardSet.length-shufflePosition;i++){
				cardSet[i] = cardSet[shufflePositionTemp];
				shufflePositionTemp++;
			}
		}
		public static void riffleShuffle(){
			Integer[] cardSetCopy = (Integer[])cardSet.clone();
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