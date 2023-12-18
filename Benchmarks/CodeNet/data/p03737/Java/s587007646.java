import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1行目、複数数字
		String[] ss0 = br.readLine().trim().split(" ", 0);

		String s = ""+(char)(ss0[0].charAt(0))+(char)(ss0[1].charAt(0))+(char)(ss0[2].charAt(0));  //=>"b"
		


        System.out.println(s.toUpperCase());
        return;
    }


}

