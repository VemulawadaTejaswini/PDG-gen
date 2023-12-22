import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		for(int n,p;;){
			n=sc.nextInt();
			p=sc.nextInt();
			if(n==0 && p==0)
				break;
			
			int[] a=new int[n];
			for(int i=0,j=p;;i=(i+1)%n){
				if(j==0){
					j+=a[i];
					a[i]=0;
				}
				else{
					j--;
					a[i]++;
					if(a[i]==p){
						System.out.println(i);
						break;
					}
				}
			}
		}
	}
}