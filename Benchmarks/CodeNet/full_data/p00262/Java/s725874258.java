import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);

		while(true){
			int n=sc.nextInt();
			if(n==0) break;

			int temp[]=new int[n];
			int b[]=new int[500];
			int d=-1,sum=0;

			for(int i=0;i<n;i++){
				temp[i]=sc.nextInt();
				b[i]=temp[i];
				sum+=temp[i];
			}

			boolean flag=false;
			for(int k=1;k<500;k++){
				if((k*(k+1))/2==sum){
					flag=true;
					//System.out.println(sum+" "+k);
					d=k;
				}
			}
			if(!flag){
				System.out.println("-1");
				continue;
			}

			flag=false;
			for(int count=0;count<=10000;count++){
				if(check(b,d)){
					flag=true;
					System.out.println(count);
					break;
				}
				b=tsuminaoshi(b,d);
			}
			if(!flag) System.out.println("-1");
		}
	}
	int[] tsuminaoshi(int b[],int d){
		int count=0,last=0;

		for(int i=0; i<500; i++){
			if(b[i]>0){
				b[i]--;
				count++;
				last=i;
			}
		}

		b[last+1]=count;

		for(int i=0; i<=last+1; i++){
			if(b[i]==0){
				for(int j=i; j<=last+1; j++){
					b[j]=b[j+1];
				}
			}
		}
//		for(int i=0; i<last+1; i++){
//			System.out.print(b[i]+" ");
//		}
//		System.out.println();
		return b;
	}

	boolean check(int b[],int d){
		
		for(int i=0; i<d-1; i++){
			if(b[i]+1 != b[i+1]){
				return false;
			}
		}
		
		return true;
	}
}