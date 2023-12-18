import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//String string = scanner.next();
		int N = scanner.nextInt();
		int[] data1 = new int[N];
		int[] data2 = new int[N];
		int[] counter1 = new int[1000000];
		int[] counter2 = new int[1000000];
		int ans = 0;

		int j = 0;
		for(int i = 0;i < N;i++){			//データ入力
			if(i%2 == 0){
				data1[i] = scanner.nextInt();
				counter1[data1[i]]++;
			}else{
				data2[j] = scanner.nextInt();
				counter2[data2[j]]++;
				j++;
			}
		}
		
		Arrays.sort(counter1);
		Arrays.sort(counter2);


		int k1 = 0;
		int k2 =0 ;
		for(int i = counter1.length-2;i >= 0;i--){

			if(counter1[i] ==  0){
				break;
			}else{
				k1 += counter1[i];
			}
		}

		for(int i = counter2.length-2;i >= 0;i--){

			if(counter2[i] ==  0){
				break;
			}else{
				k2 += counter2[i];
			}
		}

		
		if(data1[0] == data2[1] && k1 + k2 == 0){
			
			System.out.println(N/2);
		}else{
			System.out.println(k1 + k2);
		}










	}
}

