import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt();
		int o=sc.nextInt();
		int[] X=new int[x+1];
		int[] Y=new int[y+1];
		while(o-->0){
			
			int a=sc.nextInt(),b=sc.nextInt();
			int test = sc.nextInt();
			if(test==1){
				for(int i=0;i<=a;i++){
					X[i] = 1;
				}
			}
			if(test==2){
				for(int i=a+1;i<=x;i++){
					X[i] = 1;
				}
			}
			if(test==3){
				for(int i=0;i<=b;i++){
					Y[i] = 1;
				}
			}
			if(test==4){
				for(int i=b+1;i<=y;i++)
					Y[i] = 1;
			}
		}
		int xcan = 0,ycan = 0;
		for(int i=1;i<x+1;i++){
			if(X[i]==0)
				xcan++;
		}
		for(int i=1;i<y+1;i++){
			if(Y[i]==0)
				ycan++;
		}
		System.out.print(xcan*ycan);
	}
}
