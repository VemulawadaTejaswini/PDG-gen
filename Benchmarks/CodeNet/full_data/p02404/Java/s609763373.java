import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		StringBuilder art = new StringBuilder();
		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H == 0 && W == 0)
				break;
			art.append(m.makeLine("#", W) + "\n");
			for (int i = 0; i < H - 2; ++i)
				art.append("#" + m.makeLine(".", W - 2) + "#" + "\n");
			art.append(m.makeLine("#", W) + "\n");
			art.append("\n");
		}
		System.out.print(art.toString());
	}
	// ex. makeLine("#", 3) == "###".
	public String makeLine(String ch, int times) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < times; ++i)
			sb.append(ch);
		return sb.toString();
	}
}
