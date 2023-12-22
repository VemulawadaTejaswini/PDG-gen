import java.util.Arrays;
import java.util.Scanner;

public class Main {
 static boolean p[];
 public static void main(String[] args) {
	 // TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
	 Scanner sc=new Scanner(System.in);
	 int n,i,count;
	 while(true){
		 n=sc.nextInt();
		 if(n==0) break;
		 count=0;
		 p=new boolean[2*n+1];
		 Arrays.fill(p, true);
		 p[0]=p[1]=false;
		 prime(p,n);
		 for(i=n;i<=2*n;i++){
			 if(p[i]) count++;
		 }
		 System.out.println(count);
	 }
 }
	static void prime(boolean p[],int n){
		int i,j;
		for(i=2;i<=2*n;i++){
			if(p[i]){
				for(j=2*i;j<=2*n;j+=i){
					p[j]=false;
				}
			}
		}
	}
}