import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		char direction[]=new char[N];
		String people=sc.next();
		for(int i=0;i<N;i++) {
			direction[i]=people.charAt(i);
		}
		//System.out.println(direction);
		System.out.println(happiness(direction,K));
	}
	public static int happiness(char[] directions,int K) {
		int happy=0;
		int k=0;
		for(int i=0;i<directions.length;i++) {
			if(i==0) {
				if(directions[0]=='R'&&directions[1]=='R')happy++;
			}else if(i==directions.length-1) {
				if(directions[i]=='L'&&directions[i-1]=='L')happy++;
			}else {
				if(directions[i]=='R'&&directions[i+1]=='R') {
					happy++;
				}
				if(directions[i]=='L'&&directions[i-1]=='L') {
					happy++;
				}
			}
			if(i!=0) {
				if(directions[i-1]!=directions[i]) {
					k++;
				}
			}
		}
		//System.out.println(k+","+happy);
		if(K*2<k) {
			happy+=K*2;
		}else {
			happy+=k;
		}
		return happy;
	}


}
