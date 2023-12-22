import java.util.Scanner;

public class Main {
	static int[] n=new int [100];
	
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		int a=0,b=0,t=0,k=in.nextInt();
		
		while(k!=0){
			System.out.printf("%d\n",k);
			for(int i=k-1;i>1;i--){
				for(int j=0;j<100;j++)
					n[j]=0;
				t=2;
				n[0]=i;
				n[1]=k-i;
				if(n[0]>n[1])
					System.out.printf("%d %d\n",n[0],n[1]);
				while(moveRight(t)){};
			}
			for(int i=0;i<k-1;i++){
				System.out.printf("1 ");
			}
			System.out.printf("1\n");
			k=in.nextInt();
		}
		
		
	}
	static boolean moveRight(int t){
		int a=t;
		while(n[a]==0||n[a]==1){
			a--;
			
		}
		if(a!=0){
			n[a]--;
			a++;
			while(n[a]==1)
				a++;
			n[a]++;
			for(int i=0;i<a;i++){
				System.out.printf("%d ",n[i]);
			}
			System.out.printf("%d\n",n[t]);
			t++;
			return true;
		}
		return false;
		
	}
	
}