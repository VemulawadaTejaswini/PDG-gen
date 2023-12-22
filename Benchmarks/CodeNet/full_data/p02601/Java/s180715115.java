import java.util.*;

public class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		int k=sc.nextInt();
		int kari=0;
		int count=0;
		while(b<a){
			if(a>b){
				b*=2;
				count++;
			}
		}
		b+=1;
		while(c<b){
			if(b>c){
				c*=2;
				count++;
			}
		}
		
		if(count>k)System.out.println("No");
		else System.out.println("Yes");
		sc.close();
		
	}
}