import java.util.*;
import java.lang.StringBuilder;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		StringBuilder bu = new StringBuilder();
		for(int i=0;i<h;i++){
			for(int o=0;o<w;o++){
				bu.append("#");
			}
			bu.append("\n");
		}
		System.out.print(bu);
	}
}