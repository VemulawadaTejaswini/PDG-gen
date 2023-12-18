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
		for(int i=0;i<K;i++) {
			replace(direction);
			//System.out.println(direction);
		}
		System.out.println(happiness(direction));
	}
	public static int happiness(char[] directions) {
		int happy=0;
		for(int i=0;i<directions.length;i++) {
			if(i==0) {
				if(directions[1]=='R')happy++;
			}else if(i==directions.length-1) {
				if(directions[i-1]=='L')happy++;
			}else {
				if(directions[i]=='R'&&directions[i+1]=='R') {
					happy++;
				}
				if(directions[i]=='L'&&directions[i-1]=='L') {
					happy++;
				}
			}
		}
		return happy;
	}
	public static char[] replace(char[] directions) {
		int l=-1,k=directions.length;
		for(int i=0;i<directions.length-1;i++) {
			if(directions[i]!=directions[i+1]) {
				if(k>i) {
					k=i;
				}
				if(l<i) {
					l=i;
				}
			}
		}
		if(k==l) {
			l=directions.length;
		}
		//System.out.println(l+","+k);
		for(int i=k ;i<l;i++) {
			if(directions[i+1]=='L') {
				directions[i+1]='R';
			}else {
				directions[i+1]='L';
			}
		}
		return directions;
	}

}
