import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n,datos[], suma=0,temp=0, mod=998244353;
		n = read.nextInt();
		datos = new int[n];
		
		
		for(int i=0; i<n;i++)
			datos[i] = read.nextInt();
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				temp = mcm(datos[i],datos[j],mod);
				suma=(suma+temp)%mod;
				//suma=suma%mod;
				//System.out.println(datos[i]+" "+datos[j]);
			}
		}
		System.out.println(suma);
	}
	public static int mcm(int a, int b,int mod) {
		int result=((a*b)%mod)/mcd(a,b);
		return result;
	}
	public static int mcd(int a, int b) {
		return b == 0 ? a:mcd(b,a%b);
	}

}
