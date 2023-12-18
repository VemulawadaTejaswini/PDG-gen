import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int[] A = new int[N], B = new int[M];
		int X = sc.nextInt(), Y = sc.nextInt();
		for (int i=0; i<A.length; i++){
			A[i] = sc.nextInt();
		}
		for (int i=0; i<B.length; i++){
			B[i] = sc.nextInt();
		}
		boolean ok = true;
		for (int i=0; i<A.length; i++){
			if (X<A[i] && Y>=A[i]){
				for (int j=0; j<A.length; j++){
					if (!(A[i]>A[j])){
						ok = false;
						break;
					}
				}
			
				for (int j=0; j<B.length; j++){
					if (ok==false){
						break;
					}
					if (!(A[i]<=B[j])){
						ok = false;
						break;
					}
				}
				if (ok==true){
					break;
				}
			}
		}
		boolean yes = true;
		for (int i=0; i<B.length; i++){
			if (X<B[i] && Y>=B[i]){
				for (int j=0; j<A.length; j++){
					if (!(B[i]>A[j])){
						yes = false;
						break;
					}
				}
			
				for (int j=0; j<B.length; j++){
					if (yes==false){
						break;
					}
					if (!(B[i]<=B[j])){
						yes = false;
						break;
					}
				}
				if (yes==true){
					break;
				}
			}
		}
		if (ok || yes){
			System.out.println("No War");
		}else{
			System.out.println("War");
		}
	}

}