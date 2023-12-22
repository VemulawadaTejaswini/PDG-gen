import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	public static void main (String[] args){
		while(true){
			int m=sc.nextInt();
			int f=sc.nextInt();
			int r=sc.nextInt();
			if(m==-1&&f==-1&&r==-1) break;
			char result=judge(m,f,r);
			System.out.println(result);
		}
	}
	private static char judge(int m,int f,int r){
		if(m==-1||f==-1) return 'F';
		if(m+f>=80) return 'A';
		else if(m+f>=65) return 'B';
		else if(m+f>=50) return 'C';
		else if(m+f>=30&&r>=50) return 'C';
		else if(m+f>=30) return 'D';
		else return 'F';
	}
}