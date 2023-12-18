import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader BF = new BufferedReader(new InputStreamReader(System.in))) {
			String[] input = BF.readLine().split("\\s");

			double N = Long.parseLong(input[0]);
			
			if(N < 1) N = 1;
			if(N > Math.pow(10, 4)) N = Math.pow(10, 4);
			
			String[] SJ = new String[(int) N];
			
			for(int x = 1; x<=N; x++) {
				SJ[x-1] = (input.length > x ? input[x].toUpperCase() : BF.readLine().toUpperCase());
			}
			
			String SJ_AB = (String) Arrays.asList(SJ).stream().filter(val -> {
				return ((String) val).contains("AB");
			})
					.map(v -> ((String) v).replaceAll("[^AB]", ""))
					.collect(Collectors.joining(""));
			
			List<String> SJ_A_B = Arrays.asList(SJ).stream()
					.map(v -> ((String) v).replaceAll("AB", ""))
					.filter(val -> {
				return ((String) val).startsWith("A") || ((String) val).startsWith("B") || ((String) val).endsWith("A") || ((String) val).endsWith("B");
			}).collect(Collectors.toList());
			

			System.out.println((int) (SJ_AB.split("AB", -1).length-1 + Math.ceil(SJ_A_B.size()/2)));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}