import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] str = (sc.nextLine()).split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			int[] v = new int[n+1];
			int[] w = new int[n+1];
			int[] a = new int[m+1];
			int t;

			for(int i = 0; i < n; i++){
				String st = sc.nextLine();
				String[] s = (sc.nextLine()).split(" ");
				
				w[i] = Integer.parseInt(s[0]);
				v[i] = Integer.parseInt(s[1]);
				t = Integer.parseInt(s[2]);
				if(v[i] < t){
					v[i] = t;
				}
				t = Integer.parseInt(s[3]);
				if(v[i] < t){
					v[i] = t;
				}
			}
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j <= m; j++){
					if(j >= w[i]){
						if(a[j] < a[j-w[i]]+v[i]){
							a[j] = a[j-w[i]]+v[i];
						}
					}
				}
			}
			
			System.out.println(Integer.toString(a[m]));
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}