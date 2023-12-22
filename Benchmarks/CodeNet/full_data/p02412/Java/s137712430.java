import java.util.*;
 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(x == 0 && n == 0){
				break;
			}
			int ans = 0;

			for(int i=1;i<=n;i++){
				for(int j=i+1;j<=n;j++){
					for(int s=j+1;s<=n;s++){
					if(i + j + s == x){
						ans++;
					 }					
					}
				}
			}
			System.out.println(ans);
		}
	}
  }
