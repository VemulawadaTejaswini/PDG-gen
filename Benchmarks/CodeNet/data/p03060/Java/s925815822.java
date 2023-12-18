import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Integer vlist[] = new Integer[n];
		Integer clist[] = new Integer[n];

		for(int i=0; i<n; i++){
			vlist[i] = sc.nextInt();
		}

		for(int j=0; j<n; j++){
			clist[j] = sc.nextInt();
		}

		int max = 0;

		Integer sumlist[] = new Integer[n];

		for(int s=0; s<n; s++){
			sumlist[s] = vlist[s] - clist[s];
		}
		Arrays.sort(sumlist,Collections.reverseOrder());
		for(int t=0; t<n; t++){
			if(max + sumlist[t] > max){
				max += sumlist[t];
			}
		}
		System.out.println(max);
		
	}
}
