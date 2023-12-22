import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(stdIn.hasNext()){
			int n = stdIn.nextInt();
			int cnt = 0;
			int end = Math.min(n, 1000);
			for(int a=0;a<=end;a++){
				for(int b=0;b<=end;b++){
					int cd = n-a-b;
					if(cd<0) break;
					if(cd>2000) continue;
					if(cd<=1000) cnt+=cd+1;
					else cnt+=1000-(cd-1000)+1;
				}
			}
			System.out.println(cnt);
		}
	}
}