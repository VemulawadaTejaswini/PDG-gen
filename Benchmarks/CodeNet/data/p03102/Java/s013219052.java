import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] b = new int[m];
		int crt = 0;
		for(int i=0;i<m;i++){
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			int a=0;
			for(int j=0;j<m;j++){
				a+=sc.nextInt()*b[j];
			}
			a+=c;
			if(a>0)crt++;
		}
		System.out.print(crt);
	}
}