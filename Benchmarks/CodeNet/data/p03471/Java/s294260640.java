import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Y=sc.nextInt();

		int x=-1;
		int y=-1;
		int z=-1;
		
		for(int i=0;i<=N;i++){
			if(i*1000<N){
			for(int j=0;j<=N;j++){
				if(j*5000<N){
				for(int k=0;k<=N;k++){
					if(i+j+k==N&&1000*i+5000*j+10000*k==Y){
						x=i;
						y=j;
						z=k;
						System.out.println(z+" "+y+" "+x);
						i=N;
						j=N;
						k=N;
					}
				}
				}
			}
			}
		}
		if(x==-1){
			System.out.println(z+" "+y+" "+x);
		}
	}
}
