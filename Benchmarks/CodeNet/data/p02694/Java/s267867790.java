import java.util.Scanner;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long money=sc.nextLong();
		int m=100;
		int year=0;
		do{
			m+=m*0.01;
			year++;
		}while(money>=m);
		System.out.println(year-1);
	}
}