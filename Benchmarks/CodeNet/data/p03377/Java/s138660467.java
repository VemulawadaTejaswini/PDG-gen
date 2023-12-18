import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i=0; i<N; i++){
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<N; i++){
			int[] temp = new int[N-1];
			for (int j=0, k=0; j<N; j++){
				if (j==i){
					continue;
				}
				temp[k++] = arr[j];
				
			}
			Arrays.sort(temp);
			if (temp.length%2==0){
				System.out.println((temp[temp.length/2]+temp[temp.length/2+1])/2);	
			}else{
				System.out.println(temp[temp.length/2]);
			}
		}


	}

}
