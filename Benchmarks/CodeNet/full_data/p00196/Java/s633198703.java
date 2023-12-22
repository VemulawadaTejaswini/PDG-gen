import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			Team[] t = new Team[n];
			for(int i = 0;i<n;i++){
				String str = cin.next();
				int win=0,lose=0;
				for(int j = 0;j<n-1;j++){
					int a = cin.nextInt();
					if(a==0){
						win++;
					}
					else if(a==1){
						lose++;
					}
				}
				t[i]=new Team(str,win,lose,i);
			}
			Arrays.sort(t);
			for(int i = 0;i<n;i++){
				System.out.println(t[i].name);
			}
		}
	}
}
class Team implements Comparable{
	String name;
	int win;
	int lose;
	int num;
	Team(String str,int a,int b,int c){
		name=str;
		win=a;lose=b;num=c;
	}
	public int compareTo(Object o) {
		Team t = (Team)o;
		if(t.win==this.win){
			if(this.lose-t.lose==0){
				return this.num-t.num;
			}
			else{
				return this.lose-t.lose;
			}
		}
		else{
			return t.win-this.win;
		}
	}
}