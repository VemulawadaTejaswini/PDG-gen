import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Set<String> s = new HashSet<>();
		
		for(int i=0; i<N; i++) {
			s.add(br.readLine());
		}
		
		System.out.println(s.size());
	}

}