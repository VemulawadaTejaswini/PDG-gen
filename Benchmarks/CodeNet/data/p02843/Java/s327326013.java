import java.util.Scanner;

public class Main {

	private static int[] gs = new int[]{100,101,102,103,104,105};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();


		int num = X / 100;

		for(int i0 = 0;i0 < num;i0++){
			for(int i1 = 0;i1 < num;i1++){
				for(int i2 = 0;i2 < num;i2++){
					for(int i3 = 0;i3 < num;i3++){
						for(int i4 = 0;i4 < num;i4++){
							for(int i5 = 0;i5 < num;i5++){
								if(gs[0]* i0 + gs[1] * i1 + gs[2] * i2 + gs[3] * i3 + gs[4] * i4 + gs[5] * i5 == X){
									System.out.println(1);
									return;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(0);
	}
}