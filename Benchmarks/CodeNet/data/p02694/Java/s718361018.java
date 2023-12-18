import java.util.Scanner;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long money=sc.nextLong();//入力値
		long m=100;
		int year=0;
		while(m<money){
			m*=1.01;
			year++;
		}
		System.out.println(year);
	}
}