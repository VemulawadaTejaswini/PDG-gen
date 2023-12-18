import java.util.Scanner;

class Main {

	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int K=stdIn.nextInt();
		int z=0,y=0;
		while(z<K) {
			if(A%2==1) {
				A-=1;
				B+=A/2;
				A/=2;
			}
			else {
				B+=A/2;
				A/=2;
			}
			z++;
			if(z==K)
				break;
			if(B%2==1) {
				B-=1;
				A+=B/2;
				B/=2;
			}
			else {
				A+=B/2;
				B/=2;
			}
			z++;
		}
		System.out.println(A+" "+B);
	}
}