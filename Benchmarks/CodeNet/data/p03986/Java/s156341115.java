import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		boolean[] map = new boolean[200_000];
		int i = 0;
		int s = 0;
		while((s = bf.read()) != -1) {
			if (s == 83) {
				map[i] = true;
			} else if (s == 84) {
				map[i] = false;
			} else if (s == 10) {
				break;
			} else {
				continue;
			}
			i++;
		}
		
		int ans = 0;
		while(map[i - 1]) {
			ans++;
			i--;
		}
		
		System.out.println(ans * 2);
	}
}