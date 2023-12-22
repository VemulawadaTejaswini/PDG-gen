import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = Integer.parseInt(br.readLine());
		//--- listにn個数字を入れる ---
		for(int i = 0; i < n; i++){
			list.add(Integer.parseInt(scan.next()));
		}//for
		///--- ソート ---
		Collections.sort(list);//昇順に並び替える
		Collections.reverse(list);//listの順番を逆にする(昇順→降順)
		//--- list内表示 ---
		for(int i = 0; i < n; i++){
			System.out.print(list.get(i) + " ");
		}//for
	}
}