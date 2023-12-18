import java.util.Scanner;
//static long X=
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long X=sc.nextLong();
		long top=0;
		for(long i=1;;i++) {
			if(Math.pow(i,5)-Math.pow(i-1,5)==X) {
				System.out.println(i+" "+(i-1));
				System.exit(0);
			}else if(Math.pow(i,5)-Math.pow(i-1,5)>X) {
				top=(long) Math.pow(i-1,5);
				break;
			}
		}
		for(long i=top;;i--) {
			if(Math.pow(i,5)>X) {
			for(long j=0;j<=i;j++) {
			if(Math.pow(i,5)-Math.pow(i-j,5)==X) {
				System.out.println(i+" "+(i-j));
				System.exit(0);
			}else if(Math.pow(i,5)-Math.pow(i-j,5)>X) {
				break;
			}
			}
				}else {
					for(long j=0;j<=i;j++) {
						if(Math.pow(i,5)+Math.pow(i-j,5)==X) {
							System.out.println(i+" "+(-i+j));
							System.exit(0);
							}else if(Math.pow(i,5)+Math.pow(i-j,5)<X) {
								break;
							}

				}
		}}
	}
}