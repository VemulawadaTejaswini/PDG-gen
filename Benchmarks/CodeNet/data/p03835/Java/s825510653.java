import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
		int cnt=0;
		for(int x=0;x<=K;x++) {
			for(int y=0;y<=K
					; y++) {
				for(int z=K;z>=0;z--) {
					if(x+y+z==S) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);

	}

}