import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		int i,j=0;
		for( i=0;i<N;++i) {
		 a[i]=sc.nextInt(); 
		}
		outside:while(true) {
			for( i=0;i<N;++i) {
				if(a[i]%2==0) {
				a[i]=a[i]/2;	
				}else {
				break outside;
				}
			}
			++j;
		}
			System.out.println(j);
		
		}
			
	}