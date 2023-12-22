import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		for(int i=0;i<h;i++){
			for(int o=0;o<w;o++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
}