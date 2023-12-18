import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		String s=sc.next();
		char[] c=s.toCharArray();
		int[] l=new int[q];
		int[] r=new int[q];
		for(int i=0;i<q;i++){
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
		}

		for(int i=0;i<q;i++){
			int count=0;
			for(int j=l[i]-1;j<Math.min(r[i]-1,n-1);j++){
				if(c[j]=='A'&&c[j+1]=='C')
					count++;
			}
			System.out.println(count);
		}
	}
	
}