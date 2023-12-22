import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
//		int x = 1;
//		int y = 1;
//		int z = 1;
		for(int i=1;i <=N; i++) {
			int count =0;
//			x = 1;
//			y = 1;
//			z = 1;
			label:for(int x =1;x < N;x++) {
				for(int y =1;y <= x+1;y++) {
					for(int z =1;z <= x+2;z++) {
						int a =x*x+y*y+z*z+x*y+y*z+z*x;
						if(a == i) {
							if(x==y&&y==z) {
								System.out.println(1);
							} else if(x!=y&&y!=z) {
								System.out.println(6);
							} else {
								System.out.println(3);
							}
							break label;
						} else if(a > i*2) {
							System.out.println(0);
							break label;
						}
					}
				}
			}
		}
	}
}