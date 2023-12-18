import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			int N = scan.nextInt();
			int[]H = new int[N];
			for(int i = 0;i<N;i++)H[i] = scan.nextInt();
			/*
			ArrayList<Integer>ar = new ArrayList<Integer>();
			
			for(int i = 0;i<N;i++) {
				if(i==0) {ar.add(H[i]);}
				else {
					if(H[i-1]!=H[i]) {
						ar.add(H[i]);
					}
				}
		
			}
			
			for(Integer i:ar) {
				System.out.println(i);
			}*/
			
			
			for(int i = 0;i<N-1;i++) {
				if(H[i]<=H[i+1]) {
					continue;
				}else{
					H[i]--;
					/*if(H[i]>H[i+1]) {
						System.out.println("No");
						System.exit(0);
					}*/
				}
			}
			
			for(int i = 0;i<N-1;i++) {
				if(H[i]>H[i+1]) {
					System.out.println("No");
					System.exit(0);
				}
			}
			
			
			System.out.println("Yes");
			
			
		}
	}
}

