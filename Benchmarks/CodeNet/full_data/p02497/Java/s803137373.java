import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int m=0,f=0,r=0;
		while(m!=-1 || f!=-1 || r!=-1){
			m=sc.nextInt();
			f=sc.nextInt();
			r=sc.nextInt();
			if(m==-1 || f==-1)System.out.printf("F\n");
			else if(m+f>=80)System.out.printf("A\n");
			else if(m+f<80 && m+f>=65)System.out.printf("B\n");
			else if(m+f<65 && m+f>=50)System.out.printf("C\n");
			else if(m+f<50 && m+f>=30)System.out.printf("%c\n",r>=50?'C':'D');
			else System.out.printf("F\n");
		}
	}
}