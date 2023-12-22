import java.util.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n=0,m=0;
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int i=a*b;i<1;i--)
				if(i%a==0&&i%b==0)
					n=i;
			for(int j=0;j<a*b;j++)
				if(j%a==0&&j%b==0){
					m=j;break;
				}
			System.out.println(n+""+m);
		}
	}
}