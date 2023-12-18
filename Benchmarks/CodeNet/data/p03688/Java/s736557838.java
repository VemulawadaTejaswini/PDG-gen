import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DataSet d = new DataSet();
		d.input();
		int dif = d.max - d.min;
		if(dif>1)
			System.out.println("No");
		else if(dif==1){
			if(2*(d.max-d.q)<=d.p&&d.q<=d.min)
				System.out.println("Yes");
			else System.out.println("No");
		}
		else if(dif==0){
			if(d.max==d.N-1||2*d.max<=d.N)
				System.out.println("Yes");
			else System.out.println("No");
		}
	}

}

class DataSet{
	int N;
	int[] a;
	int max=0,min=1000000;
	int p = 0,q = 0;
	public void input(){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		a = new int[N];
		for(int i=0;i<N;i++){
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
			min = Math.min(min,a[i]);
		}
		for(int i=0;i<N;i++){
			if(a[i]==max) p++;
			if(a[i]==min) q++;
		}
		sc.close();
	}
	
}