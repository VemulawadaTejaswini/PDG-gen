import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n= sc.nextInt();
			int o= sc.nextInt();
			int wa = n+o;
			System.out.println(sum(wa));
			}
		sc.close();



	}
	static int sum(int n){
		int i=1;
		int t=10;
		while(n>=t){
			t=t*10;
			i++;
			}
		return i;
	}
}