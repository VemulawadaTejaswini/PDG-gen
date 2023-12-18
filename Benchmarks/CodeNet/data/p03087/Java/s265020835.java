import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String str = sc.next();
		boolean a[] = new boolean[n];
		boolean b[] = new boolean[n];
		
		for(int i = 0; i < n; i++){
			char c = str.charAt(i);
			if(c == 'A'){
				a[i] = true;
			}else if(c == 'C'){
				b[i] = true;
			}else{
				a[i] = false;
				b[i] = false;
			}
		}
		
		for(int i = 0; i < q; i++){
			int l = sc.nextInt();
			int r = sc.nextInt();
			int answer = 0;
			
			for(int j = l-1; j < r-1; j++){
				if(a[j]){
					if(b[j+1]){
						answer += 1;
					}
				}
			}
			System.out.println(answer);
		}
	}
}