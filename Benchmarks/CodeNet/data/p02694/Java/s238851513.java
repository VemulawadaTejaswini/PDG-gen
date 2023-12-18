import java.util.Scanner;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long money=sc.nextLong();//入力値
		var m=100;
		int year=0;
		do{
			m*=1.01;
			year++;
		}while(m<money);
		System.out.println(year);
	}
}