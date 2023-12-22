import java.util.*;

public class Main {
    int GCD(int a,int b){
		if(b>a){int x=a;a=b;b=x;}
		while (a%b!=0){
			int x=a;
			a=b;b=x%b;
		}
		return b;
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    System.out.println(new Main().GCD(sc.nextInt(),sc.nextInt()));
	}
}
