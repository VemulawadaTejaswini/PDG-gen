import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,m,i,a,b,count = 0,j=0,k,p;
		int f[] =new int[100];
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		while(true){
			if(n==0 && m==0){
				break;
			}
			for(i=0;i<m;i++){
				a=sc.nextInt();
				b=sc.nextInt();
				if(a==1){
					count++;
					f[j]=b;
					j++;
				}
				for(k=0;k<j;k++){
					if(a==f[k]){
						//System.out.println("!   "+count);
						for(p=0;p<j;p++){
							if(p==k){
								p++;
							}
							if(f[k]==f[p]){
								//System.out.println("a= "+a);
								break;
							}
						}
						//System.out.println("p= "+p+"j= "+j);
						if(p>=j)
							count++;
					}
				}//k for
			}//i for
			System.out.println(count);
			count=0;
			for(k=0;k<j;k++){
				f[k]=0;
			}
			n=sc.nextInt();
			m=sc.nextInt();
		}//while
	}
}