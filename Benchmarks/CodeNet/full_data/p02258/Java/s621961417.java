import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		int n,i,j,a,maxv,minv;
		Scanner sc=new Scanner(System.in);
		n=Integer.parseInt(sc.next());
		int r[]=new int[n];
		for(i=0;i<n;i++){
			r[i]=Integer.parseInt(sc.next());
		}

		maxv=r[1]-r[0];
		minv=r[0];
		for(j=1;j<n;j++){
			maxv=Math.max(maxv, r[j]-minv);
			minv=Math.min(minv, r[j]);
		}

		System.out.println(maxv);


	}

}