import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int[] d = new int[4001];
			boolean[] f = new boolean[4001];
			for(int i=0;i<n;i++){
				int num = stdIn.nextInt();
				int single = stdIn.nextInt();
				int element = stdIn.nextInt();
				for(int j=0;j<element;j++){
					if(!f[num]){
						d[num] += single;
					}
					if(d[num]>999999){
						f[num] = true;
					}
				}
			}
			boolean output = true;
			for(int i=1;i<=4000;i++){
				if(f[i]){
					System.out.println(i);
					output = false;
				}
			}
			if(output){
				System.out.println("NA");
			}
		}
	}
}