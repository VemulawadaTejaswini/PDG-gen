import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,r,p,c,i,j,k;
		int card[],temp[];
		while(true){
			n=sc.nextInt();
			r=sc.nextInt();
			if(n+r==0) break;
			card=new int[n];
			for(i=0;i<n;i++){
				card[i]=i;
			}
			for(k=0;k<r;k++){
				p=sc.nextInt();
				c=sc.nextInt();
				temp=new int[p-1];
				j=n-1;
				for(i=0;i<p-1;i++){
					temp[i]=card[j--];
				}
				j=n-1;
				for(i=0;i<c;i++){
					card[j]=card[j-p+1];
					j--;
				}
				for(i=0;i<p-1;i++){
					card[j--]=temp[i];
				}
			}//end for
			System.out.println(card[n-1]+1);
		}
	}
	static void print(String str,int c[]){
		System.out.print(str+":");
		for(int i=0;i<c.length;i++){
			System.out.print(" "+c[i]);
		}
		System.out.println();
	}
}