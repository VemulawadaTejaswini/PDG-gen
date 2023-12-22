import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		boolean first = true;
		for(;;){

			int N = cin.nextInt();
			if(N==0){
				break;
			}
			if(first){
				first=false;
			}
			else{
				System.out.println();
			}
			Team t[] = new Team[N];
			for(int i=0;i<N;i++){
				String s = cin.next();
				int a= cin.nextInt();
				int b= cin.nextInt();
				int c= cin.nextInt();
				t[i]=new Team(s,i,a,b,c);
			}
			Arrays.sort(t);
			
			for(int i = N-1;i>=0;i--){
				System.out.println(t[i].name+","+t[i].total);
			}
		}
		
	}

}
class Team implements Comparable{
	String name;
	int num;
	int win;
	int lose;
	int drow;
	int total;
	Team(String s,int a,int b,int c,int d){
		name=s;
		num=a;
		win=b;
		lose=c;
		drow=d;
		total = b*3+drow;
	}
	public int compareTo(Object o){
		Team t = (Team)o;
		if(this.total==t.total){
			return t.num-this.num;
		}
		else{
			return this.total-t.total;
		}
	}
	
}