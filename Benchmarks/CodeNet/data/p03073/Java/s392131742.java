import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int v[] = new int[s.length()];
		for(int i=0; i<s.length(); i++){
			v[i] = Integer.parseInt(s.substring(i,i+1));
		}
		int ans=0;
		for(int i=1; i<v.length; i++) {
			if(v[i] == v[i-1]) {
				v[i] = (v[i]+1)%2;
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
