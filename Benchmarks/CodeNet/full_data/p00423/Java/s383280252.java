import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] a=new int[10000];
		int[] b=new int[10000];
		int[] n=new int[10000];
		int ansA=0;
		int ansB=0;
		int k=0;
		int h=0;
		int a1=0;
		int b1=0;
		
		Scanner scan = new Scanner(System.in);
		while(true){
			int in =scan.nextInt();
			if(in==0)
				break;
			n[h]=in;
			h++;
			for (int i = a1; i < a1+in; i++) {
					a[i]=scan.nextInt();
					b[i]=scan.nextInt();
					//b1=b1+1;
				
				k=i;
			}
			a1=k+1;
			//System.out.println(scan.nextInt());
		}
		k=0;
		for(int j=0;j<10000;j++){
			if(n[j]==0)
				break;

			for (int i = k; i <k+n[j]; i++) {
				if(a[i]>b[i])
					ansA=ansA+a[i]+b[i];
				else if(a[i]<b[i])
					ansB=ansB+a[i]+b[i];
				else{	
					ansA=ansA+a[i];
					ansB=ansB+b[i];
				}
				h=i;
				//System.out.println(""+a[i]+" "+b[i]);
			}
			k=h+1;

			System.out.println(ansA+" "+ansB);
			ansA=0;
			ansB=0;
		}		
	}
}