import java.util.ArrayList;
import java.util.Scanner;


class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		int[][] data = new int[H+1][W+1];
		for(int i= 1;i <= H;i++){
			for(int j = 1;j <= W;j++){
				data[i][j] = scan.nextInt();
			}
		}
		ArrayList<Pair> pairs = new ArrayList<Pair>();
		
		int count = 0;
		for(int i= 1;i <= H;i++){
			for(int j = 1;j <= W;j++){
				if(data[i][j] % 2 != 0){
					if(j+1 <= W){
						if(data[i][j+1] % 2 != 0){
							
							data[i][j] --;
							data[i][j+1]++;
							
							count++;
							Pair aPair = new Pair(i,j);
							Pair bPair = new Pair(i,j+1);
							pairs.add(aPair);
							pairs.add(bPair);


						}else if(i+1 <= H && data[i+1][j] % 2 != 0){

							data[i][j]--;
							data[i+1][j]++;
							
							count++;
							Pair aPair = new Pair(i,j);
							Pair bPair = new Pair(i+1,j);
							pairs.add(aPair);
							pairs.add(bPair);

						}else{

							data[i][j]--;
							data[i][j+1]++;
							
							count++;
							Pair aPair = new Pair(i,j);
							Pair bPair = new Pair(i,j+1);
							pairs.add(aPair);
							pairs.add(bPair);

						}
					}else if(i+1 <= H){

						data[i][j]--;
						data[i+1][j]++;
						
						count++;
						Pair aPair = new Pair(i,j);
						Pair bPair = new Pair(i+1,j);
						pairs.add(aPair);
						pairs.add(bPair);

					}
				}
			}
		}
		
		System.out.println(count);
		for(int i = 0;i < pairs.size();i=i+2){
			System.out.print(pairs.get(i).from+" "+pairs.get(i).end + " "+pairs.get(i+1).from+" "+pairs.get(i+1).end );
			System.out.println();
		}
		



	}
}
class Pair implements Comparable{
	int from;
	int end;
	
	public Pair(int a,int b) {
		this.from = a;
		this.end = b;
		
	}
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

