import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int d=sc.nextInt();
			int dx=600/d;
			int s=0;
			for(int x=0;x<600;x=x+d){
				s=s+x*x*d;
			}
			System.out.println(s);
		}
	}
}