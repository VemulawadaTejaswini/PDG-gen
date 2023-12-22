import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] R = new int[n];
		
		for(int i=0;i<n;i++){
			R[i] = Integer.parseInt(sc.next());
		}
		
		int max=R[1]-R[0];
		int rmin=R[0];
		for(int i=0;i<n-1;i++){
			if(rmin<R[i]){
				int rmax=R[i];
				for(int j=i;j<n;j++){
					if(rmax>R[j]){
						if(max<rmax-rmin) max=rmax-rmin;
						rmin=R[j];
						break;
					}else{
						rmax=R[j];
					}
				}
			}else{
				rmin=R[i];
			}
		}
		System.out.println(max);

	}

}