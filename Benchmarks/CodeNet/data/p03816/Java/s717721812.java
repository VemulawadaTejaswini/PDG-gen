import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行目個数、2行目の複数の数字を配列に格納
		//   3
		//   1 2 3
		int N = Integer.parseInt(br.readLine());
		// 1行、複数文字、Listに格納
		List<String> list = Arrays.asList( br.readLine().trim().split(" ", 0) );
		
		//list.stream().distinct().forEach(System.out::print);
		


        System.out.println(list.stream().distinct().collect(Collectors.toList()).size());
        return;
    }
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

}