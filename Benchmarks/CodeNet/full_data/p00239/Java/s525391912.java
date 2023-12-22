import java.util.Scanner;
public class Main{
	Scanner sc = new Scanner(System.in);
	int n,i,P,Q,R,C,han;
	int[] p = new int[1000];
	int[] q = new int[1000];
	int[] r = new int[1000];
	int[] kei = new int[1000];
	int[] hoz = new int[1000];
	public void shori(){
		n = sc.nextInt();
		while(n!=0){
			for(int j=0; j<n; j++){
				i = sc.nextInt();
				p[j] = sc.nextInt();
				q[j] = sc.nextInt();
				r[j] = sc.nextInt();
				kei[j] = ((p[j]*4)+(q[j]*9)+(r[j]*4));
				hoz[j] = i;
			}
			P = sc.nextInt();
			Q = sc.nextInt();
			R = sc.nextInt();
			C = sc.nextInt();
			han = 0;
			for(int j=0; j<n; j++){
				if(p[j]>P || q[j]>Q || r[j]>R || kei[j]>C){
				}else{
					han+=1;
					System.out.println("\n"+hoz[j]);
				}
			}
			if(han==0){
				System.out.println("\n NA");
			}
			n = sc.nextInt();
		}
	}
	public static void main(String[] args){
		Main obj = new Main();
		obj.shori();
	}
}