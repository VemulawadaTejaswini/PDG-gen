import java.util.Scanner;
class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] S = new int[n]; 
		
		for(int i = 0; i < n; i++){
			S[i] = scan.nextInt();
		}
		
		int q = scan.nextInt();
		int[] T = new int[q];
		
		for(int i = 0; i < q; i++){
			T[i] = scan.nextInt();
		}
		
		int result = 0;
		for(int i = 0; i < T.length; i++){
			result += BinarySearch(S, T[i]);
		}
		
		System.out.println(result);
	}

	static int BinarySearch(int data[], int serch){
		
		int min = 0;
		int max = data.length - 1;
		
		while(min <= max){
			
			int middle = (min + max) / 2;
			if(serch == data[middle]){
				return 1;
			}else if(serch < data[middle]){
				max = middle - 1;
			}else{
				min = middle + 1;
			}
		}
		return 0;
	}
}