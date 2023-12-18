import java.util.Scanner;

class Main{
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] xdata = new int[N] ;
		int[] ydata = new int[N] ;
		int[] hdata = new int[N] ;



		for(int i = 0;i < N;i++){
			xdata[i] =  scanner.nextInt();
			ydata[i] =  scanner.nextInt();
			hdata[i] =  scanner.nextInt();


		}
		for(int i= 0;i < N;i++){
			int H = 0;
			for(int x = 0;x <= 100;x++){
				for(int y = 0;y <= 100;y++){
					 H = hdata[i] + Math.abs(x-xdata[i]) + Math.abs(y - ydata[i]);
					 for(int j = i+1;j < N;j++){
						 if(hdata[j] != Math.max(H -Math.abs(x-xdata[j]) - Math.abs(y - ydata[j]) , 0)){
							 break;
						 }else if(j == N -1){
							 System.out.println(x+" "+ y+" "+H);

							 return;
						 }
						 
					 }
				}
			}
		}

	}


}

class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

