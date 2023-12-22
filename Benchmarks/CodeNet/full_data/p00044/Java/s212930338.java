import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 3){
				System.out.println(2 + " " + 5);
				continue;
			}
			int[] v = new int[50100];
			for(int i = 0;i < 50100;i++){
				v[i] = 1;
			}
			int p = 3;
			while(true){
				if(p*p > 50100){
					break;
				}else{
					if(v[(p-1)/2] == 0){
						p += 2;
					}else{
						int t = p*p;
						while(t < 50100){
							v[(t-1)/2] = 0;
							t += 2*p;
						}
						p += 2;
					}
				}
			}
			int prev = 0;
			boolean sw = false;
			for(int i = 1;i < 50100;i++){
				if(v[i] != 1){
					continue;
				}
				if((2*i + 1) == n){
					sw = true;
					continue;
				}
				if(sw){
					System.out.println(2*prev+1 + " " + (2*i+1));
					break;
				}
				prev = i;
			}
		}
	}
}