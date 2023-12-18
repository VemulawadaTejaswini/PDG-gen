import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D=sc.nextInt();
		int G=sc.nextInt();
		
		int[] p=new int[11];
		int[] c=new int[11];
		int[] score=new int[11];
		
		for(int i=1;i<=D;i++){
			p[i]=sc.nextInt();
			c[i]=sc.nextInt();
			score[i]=100*i*p[i]+c[i];
		}
//		for(int i=1;i<=D;i++)
//			System.out.println(100*i+":"+score[i]);
		
		int num=0;
		outside:while(true){
			int take=0;
			double max=0;
			for(int i=1;i<=D;i++){
				if(1.0*score[i]/p[i]>max){
					if(score[i]<G){
						take=i;
						max=1.0*score[i]/p[i];
					}else{
						break outside;
					}
				}
			}
			G-=score[take];
			score[take]=0;
			num+=p[take];
		}
		
		int last=D;
		while(score[last]==0) last--;
		num += (G-1)/(last*100)+1;
		System.out.println(num);
//		for(int i=1;i<=D;i++)
//			System.out.println(100*i+":"+score[i]);
		
	}
}