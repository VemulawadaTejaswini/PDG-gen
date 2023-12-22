import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] l = new int[n];
		
		for(int i = 0; i < n; i++) {
			l[i] = scan.nextInt();
			
		}
		int ans = 0;
	
		for( int i= 0; i < l.length; i++) {
			for(int j = 0; j < l.length; j++) {
				for(int k = 0; k < l.length; k++) {
					
					if(i < j && j < k) {
						
						if((l[i] != l[j] && l[k] != l[j] && l[i] != l[k])) {
							if(Math.abs(l[i]-l[j]) < l[k] && l[k] < (l[i]+l[j])) {
								//System.out.println(l[i] + " " + l[j] + " " + l[k]);
								ans++;
							}
							
						}
							
					}
					
				}
			}
		}
		
		System.out.print(ans);
	}

}
