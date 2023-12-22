import java.util.Scanner;

public class Main{
	
	int a,b,c,i;
	int cnt=0;
	public void input(){
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		c = sc.nextInt();
		b = sc.nextInt();
	}
	
	public void count(){
		for(i=a; i<=b; i++){
			if(i%c == 0){
				cnt++;
			}
		}
		System.out.print(cnt);
	}
	
	public static void main(String[] args){
		Main obj = new Main();
		obj.input();
		obj.count();
	}
}