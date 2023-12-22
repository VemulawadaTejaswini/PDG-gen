import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = stdIn.nextInt();
			}
			boolean first = false;
			for(int i=0;i<n;){
				int start = a[i];
				int goal = a[i];
				int j;
				for(j=i+1;j<n;j++){
					if(goal+1==a[j]){
						// OK
						goal = a[j];
					}
					else{
						// NG
						break;
					}
				}
				if(first){
					System.out.print(" ");
				}
				first = true;
				if(goal!=start){
					System.out.print(start+"-"+goal);
				}
				else{
					System.out.print(start);
				}
				i = j;
			}
			System.out.println();
		}
	}
}