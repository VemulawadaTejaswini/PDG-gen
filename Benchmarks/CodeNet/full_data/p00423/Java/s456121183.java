//Volume5-0500
import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n,a,b,i,j;
		while((n=sc.nextInt())!=0){
			a=0; b=0;
			while(n-- > 0){
				i = sc.nextInt();
				j = sc.nextInt();
				if(i==j){
					a+=i; b+=j;
				} else if(i>j) {
					a+=(i+j);
				} else {
					b+=(i+j);
				}
			}
			System.out.println(a+" "+b);
		}
	}
}