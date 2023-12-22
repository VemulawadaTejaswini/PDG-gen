import java.util.Arrays;
import java.util.Scanner;

//Prime Quadruplet
public class Main{

	public static void main(String[] args) {
		boolean[] p = new boolean[10000000];
		Arrays.fill(p, true);
		p[0]=p[1]=false;
		for(int i=2;i<10000000;i++)if(p[i])for(int j=i*2;j<10000000;j+=i)p[j]=false;
		int[] q = new int[900];
		int id = 0;
		for(int i=13;i<10000000;i+=2){
			if(p[i-8]&&p[i-6]&&p[i-2]&&p[i])q[id++]=i;
		}
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int k = 0;
			while(k<900){
				if(q[k]>n)break;
				k++;
			}
			System.out.println(q[k-1]);
		}
	}
}