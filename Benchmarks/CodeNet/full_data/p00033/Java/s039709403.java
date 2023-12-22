import java.util.Scanner;
public class Main {
	static int a[]=new int[10];
	static int x[]=new int[10];
	static int y[]=new int[10];
	static boolean f;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n;
		n=sc.nextInt();
		while(n--!=0){
			for(i=0;i<10;i++){
				a[i]=sc.nextInt();
			}
			f=false;
			check(0,0,0);
			if(f){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
	public static void check(int i,int k,int h){
		int j,l;
		if(i==9){
			for(j=1;j<k;j++){
				if(x[j-1]>=x[j]) break;
			} 
			for(l=1;l<h;l++){
				if(y[l-1]>=y[l]) break;
			}
			if(j==k && l==h) f=true;
			return;
		}
		x[k]=a[i];
		check(i+1,k+1,h);
		y[h]=a[i];
		check(i+1,k,h+1);
	}
}