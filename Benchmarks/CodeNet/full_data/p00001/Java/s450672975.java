import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n[]=new int[10];
		int a=0;int b=0;int c=0;
		for(int i=0;i<10;i++){
			n[i] = sc.nextInt();
			if(a<n[i]){
				b=a;
				a=n[i];
			}else if(b<n[i]){
				c=b;
				b=n[i];
			}else if(c<n[i]){
				c=n[i];
			}
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}