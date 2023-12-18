import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		String[] data = input.split("\\s");

		int w,h,n;

		w = Integer.parseInt(data[0]);
		h = Integer.parseInt(data[1]);
		n = Integer.parseInt(data[2]);

		boolean[][] rect = new boolean[w][h];
		for(int i = 0;i<w;i++){
			for(int j = 0;j<h;j++){
				rect[i][j]=false;
			}
		}

		input = scanner.nextLine();

		for(int c =1;c<n ;input = scanner.nextLine(),c++){
			data = input.split("\\s");

			int x = Integer.parseInt(data[0]);
			int y = Integer.parseInt(data[1]);
			int a = Integer.parseInt(data[2]);

			switch (a){
				case 1:
					for (int i = 0; i<x;i++){//x
						for(int j = 0;j<h;j++){//y
							rect[i][j] = true;
						}
					}
					break;
				case 2:
					for (int i = w-x; i<w;i++){//x
						for(int j = 0;j<h;j++){//y
							rect[i][j] = true;
						}
					}
					break;
				case 3:
					for (int i = 0; i<w;i++){//x
						for(int j = 0;j<y;j++){//y
							rect[i][j] = true;
						}
					}
					break;
				case 4:
					for (int i = 0; i<w;i++){//x
						for(int j = h-y;j<h;j++){//y
							rect[i][j] = true;
						}
					}
					default:
						break;
			}
		}
		int bc = 0;

		for(int i = 0;i<w;i++){
			for(int j = 0;j<h;j++){
				if(rect[i][j]){
					bc++;
				}
			}
		}
		System.out.println(bc);
	}
}