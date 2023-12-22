import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L=sc.nextInt(),A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt(),D=sc.nextInt();
		if(A%C==0){
			if(B%D==0){
				if(A/C<B/D){
					System.out.println(L-B/D);
				}else{
					System.out.println(L-A/C);
				}
			}else{
				if(A/C<B/D+1){
					System.out.println(L-(B/D+1));
				}else{
					System.out.println(L-A/C);
				}
			}
		}else{
			if(B%D==0){
				if(A/C+1<B/D){
					System.out.println(L-B/D);
				}else{
					System.out.println(L-A/C+1);
				}
			}else{
				if(A/C+1<B/D+1){
					System.out.println(L-(B/D+1));
				}else{
					System.out.println(L-(A/C+1));
				}
			}
		}
		// TODO Auto-generated method stub

	}

}