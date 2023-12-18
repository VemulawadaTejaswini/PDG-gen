import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();

		String ret = ":(";

		if(b - a >= 15){
			System.out.println(ret);
		}else{
			if(c - a >= 15){
				System.out.println(ret);
			}else{
				if(d - a >= 15){
					System.out.println(ret);
				}else{
					if(e - a >= 15){
						System.out.println(ret);
					}else{
						if(c - b >= 15){
							System.out.println(ret);
						}else{
							if(d - b >= 15){
								System.out.println(ret);
							}else{
								if(e - b >= 15){
									System.out.println(ret);
								}else{
									if(d - c >= 15){
										System.out.println(ret);
									}else{
										if(e - c >= 15){
											System.out.println(ret);
										}else{
											if(e - d >= 15){
												System.out.println(ret);
											}else{
												System.out.println("Yay!");
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		sc.close();
	}
}
