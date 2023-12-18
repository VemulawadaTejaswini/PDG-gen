import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int count = 0;
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < n; j++){
				if(i == 0){
					a[j] = scan.nextInt();
				}else if(i == 1){
					b[j] = scan.nextInt();
				}else if(i == 2){
					c[j] = scan.nextInt();
				}
			}
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				for(int k = 0; k < n; k++){
					if(a[i] < b[j]){
						if(b[j] < c[k]){
							count += 1;
						}
					}
				}
			}
		}
		System.out.println(count);	
  }
}