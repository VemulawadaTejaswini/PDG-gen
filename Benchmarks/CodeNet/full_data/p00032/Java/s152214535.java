import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=0;
		int m=0;
		while(sc.hasNext()){
			String[] s=sc.next().split(",");
			int a=Integer.parseInt(s[0]);
            int b=Integer.parseInt(s[1]);
            int r=Integer.parseInt(s[2]);
            if(a==b){
            	if(r*r==a*a+b*b){
            		m++;
            	}
            }else{
            	if(r*r==a*a+b*b){
            		n++;
            	}
            }
            System.out.println(n);
            System.out.println(m);
		}
	}
}