import java.util.Scanner;



class Main{

	public static void main(String[] args) {



		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();

		int[] wBefore = new int[N];
		for(int i = 1;i < N;i++){
			if(S.charAt(i-1) == 'W'){
				wBefore[i] += wBefore[i-1] + 1;
			}else{
				wBefore[i ] = wBefore[i -1];
			}
		}

		int[] eafter = new int[N];
		for(int i=S.length()-2; i >= 0; i--){
			if(S.charAt(i+1) =='E'){
				eafter[i] += eafter[i+1] + 1;
			}else{
				eafter[i] = eafter[i+1];
			}
			
		}
		
		
		int min =Integer.MAX_VALUE;
		for(int i = 0; i < S.length();i++){
			min = Math.min(min, wBefore[i]+eafter[i]);
		}
		
		
		System.out.println(min);





	}
}






