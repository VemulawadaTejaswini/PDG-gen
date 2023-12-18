import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int[] data = new int [10000001];
		data[0] = 2;
		data[1] = 3;
		data[2] = 5;
		data[3] = 7;
		data[4] = 3;

		int c = 0;
		
		for(int i = 55555;i > 2;i++){
			for(int j = 2;j <= (i+1)/2;j++){
				if(i % j == 0){
					break;
				}
				if(j == (i + 1)/2){
					data[c] = i;
					c++;
					if(c == N){
						for(int k = 0;k < N;k++){
							System.out.println(data[k]);
						}
						return;

					}
				}
				
			}
		}

	}
}




class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



