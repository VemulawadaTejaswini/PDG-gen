import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] A = new int[K];
			for(int i = 0 ; i < K ; i++){
				A[i] = sc.nextInt();
			}
		sc.close();

		int count = 0;
		complete :
		for(int i = N ; i <= 99999 ; i++){
			String T = Integer.toString(i);

			next:
			for(int j = 0 ; j < T.length() ; j++){
				String m = T.substring(j, j+1);
				for(int k = 0 ; k < A.length ; k++){
					if(Integer.parseInt(m) == A[k]){
						count = 0;
						break next;
					}
					else{
						count++;
					}
				}
				int pp = K * T.length();
				if(pp == count){
					System.out.println(i);
					break complete ;
				}
			}
		}
	}
}
