import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
	// 2020/2/8 No.146
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();
	List<String> days = Arrays.asList("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT");
	int result = 7 - days.indexOf(str);
	System.out.println(result);
    }
}