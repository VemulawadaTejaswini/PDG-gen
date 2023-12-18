import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(donuts(sc));
	}


	static int donuts(Scanner sc){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ab = sc.nextInt();
		int ab2 = ab * 2;
		int an = sc.nextInt();
		int bn = sc.nextInt();


		if(a + b > ab2){
			int cn = Math.abs(an - bn);

			if( an > bn ){
				if(a > ab2){
					return ab2 * an;
				}else{
					return a * cn + ab2 *  bn;
				}
			}else{
				if(a > ab2){
					return ab2 * bn ;
				}else{
					return b * cn + ab2 * an;
				}
			}


		}else{
			return a * an + b * bn;
		}
	}
}