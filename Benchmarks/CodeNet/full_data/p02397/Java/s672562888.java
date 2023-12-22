import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner br = new Scanner(System.in);
		int x;
		int y;
		StringBuilder sb = new StringBuilder();
		while (true){
			x = br.nextInt();
			y = br.nextInt();
			if (x == 0&&y==0){
				break;
			} else if (x<y){
				sb.append(x).append(" ").append(y).append("\n");
			} else {
				sb.append(y).append(" ").append(x).append("\n");
			}
		}
		System.out.print(sb);
	}
}