import java.util.Scanner;

//6/1コンテスト

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int aa =0;
		int bb =0;
		int zz =0;
		String s = sc.next();
		String[] fruit = s.split("");
        int C = c-1;
		int D = d-1;

		for(int i=0;fruit.length>i;i++) {
			int A=a-1;
			int B=b-1;

			if(fruit[A].equals("#")) {
				System.out.println("NO");
				break;
			}
			if(fruit[B].equals("#")) {
				System.out.println("NO");
				break;
			}
			//if(A==B) {
				//System.out.println("NO");
				//break;
			//}

			if(A==C&&B==D) {
				System.out.println("YES");
				break;
			}

			if (A!=C&&B==D) {
				a++;
				if(fruit[a-1].equals("#")) {
					a++;
					aa =1;
					if(fruit[a-1].equals("#")) {
						System.out.println("NO");
						break;
				    }
				}

			}

			if (A==C&&B!=D) {
				b++;
				if(fruit[b-1].equals("#")) {
					b++;
					bb =1;
					if(fruit[b-1].equals("#")) {
						System.out.println("NO");
						break;
					}
				}

			}

			if (A!=C&&B!=D) {
				a++;
				b++;
				if(fruit[a-1].equals("#")) {
					a++;
					aa =1;
					if(fruit[a-1].equals("#")) {
						System.out.println("NO");
						break;
					}
				}
				if(fruit[b-1].equals("#")) {
					b++;
					bb =1;
					if(fruit[b-1].equals("#")) {
						System.out.println("NO");
						break;
					}
				}
			}

			if(A==B) {
				if(fruit[a-2].equals(".")) {
					a--;
				}
				else if(fruit[b-2].equals(".")) {
					b--;
				}
				else {
					System.out.println("NO");
					break;
				}

			}

		}

	}

}
