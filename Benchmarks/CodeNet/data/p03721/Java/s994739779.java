import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			long K = sc.nextLong();
			int[] InputA = new int[N];
			int[] InputB = new int[N];
			int tempA = 0;
			int tempB = 0;
			for(int i = 0; i < N; i++){
				InputA[i] = sc.nextInt();
				InputB[i] = sc.nextInt();
			}
			for(int i = N-1; i > 1; i--){
				for(int j = 0; j < i; j++){
					if(InputA[j] > InputA[j+1]){
						tempA = InputA[j];
						InputA[j] = InputA[j+1];
						InputA[j+1] = tempA;
						tempB = InputB[j];
						InputB[j] = InputB[j+1];
						InputB[j+1] = tempB;
					}
				}
			}
			long count = 0;
			int result = 0;
			for(int i = 0; i < N; i++){
				count += InputB[i];
				if(count >= K){
					result = InputA[i];
					break;
				}
			}
			System.out.println(result);
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
}