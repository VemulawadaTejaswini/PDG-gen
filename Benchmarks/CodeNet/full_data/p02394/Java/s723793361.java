import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int W = a.nextInt();
		int H = a.nextInt();
		int x = a.nextInt();
		int y = a.nextInt();
		int r = a.nextInt();
		if((x + r) > W || (x - r) < 0 || (y + r) > H || (y - r) < 0){
			System.out.println("No");
		}else{
				System.out.println("Yes");
			}
		}
	}