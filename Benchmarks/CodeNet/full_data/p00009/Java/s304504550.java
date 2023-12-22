import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n%2 != 0){
				n += 1;
			}
			int halfN = n/2;
			int[] v = new int[n];
			for(int i=0;i < halfN;i++){
				v[i] = 1;
			}
			int p = 3;
			while(true){
				if(p*p > n){
					break;
				}else{
					if(v[(p-1)/2] == 0){
						p += 2;
					}else{
						int t = p*p;
						while(t < n){
							v[(t-1)/2] = 0;
							t += 2*p;
						}
						p += 2;
					}
				}
			}
			int count = 0;
			for(int i = 0;i < halfN;i++){
				if(v[i] == 1){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}