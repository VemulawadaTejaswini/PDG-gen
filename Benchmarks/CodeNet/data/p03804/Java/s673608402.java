import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);

		int N = cin.nextInt();
		int M = cin.nextInt();

		String large[] = new String[N];
		String small[] = new String[M];
		for(int i=0;i<N;i++){
			large[i] = cin.next();
		}

		for(int j=0;j<M;j++){
			small[j] = cin.next();
		}

		cin.close();
		int count = 0;
		String result = "No";
		for(int k=0;k<N-M+1;k++){
			for(int l=0;l<N-M+1;l++){
				if(large[k].charAt(l)==small[count].charAt(0)){
					if(large[k].substring(l).equals(small[count])){
						count++;
						continue;
					}else{
						count = 0;
					}
				}
			}
			if(count==(M-1)){
				result = "Yes";
				break;
			}
		}
		System.out.println(result);
	}
}
