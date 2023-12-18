import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		int[] v = new int[n];
		for(int i = 0;i < n;i++){
			v[i] = Integer.parseInt(spl[i]);
		}
		sc.close();

		
		int[] diff = new int[n/2];
		
		for(int i = 0;i < n/2;i++){
			diff[i] = Math.abs(v[2*i] - v[2*i + 1]);
		}
		
		int num = 0;
		int cnt = 0;
		int results = n/2;	
		for(int i = 0;i < diff.length;i++){
			num = diff[i];
			for(int j = 0;j < diff.length;j++){
				if(diff[j] != num || diff[j] == 0){
					cnt++;
				}
			}
			if(cnt < results){
				results = cnt;
			}
			cnt = 0;
		}
		System.out.println(results);
	}
}