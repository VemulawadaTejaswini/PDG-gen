import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sx = scanner.nextInt(),sy = scanner.nextInt();
		int tx = scanner.nextInt(),ty = scanner.nextInt();
		int x = Math.abs(sx-tx);
		int y = Math.abs(sy-ty);
		String path = "";
		for(int i=0;i<x;i++){
			path += "R";
		}
		for(int i=0;i<y;i++){
			path += "U";
		}
		for(int i=0;i<x;i++){
			path += "L";
		}
		for(int i=0;i<y;i++){
			path += "D";
		}
		path = path + "D";
		for(int i=0;i<x+1;i++){
			path += "R";
		}
		for(int i=0;i<y+1;i++){
			path += "U";
		}
		path += "L";
		path += "U";
		for(int i=0;i<x+1;i++){
			path += "L";
		}
		for(int i=0;i<y+1;i++){
			path += "D";
		}
		path += "R";

		System.out.println(path);
	}

}
