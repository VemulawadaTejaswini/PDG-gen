import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		int[] a = null;
		int q  =0;
		int[] m = null;

		try(BufferedReader br
				= new BufferedReader( new InputStreamReader(System.in) )) {

			n = Integer.parseInt(br.readLine());
			a = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			q = Integer.parseInt(br.readLine());
			m = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Set<Integer> canMaked = new HashSet<>();
		for (int i = 0; i < n; i++) {
			final int now = a[i];
			canMaked.addAll(canMaked.stream().map(num -> num + now).collect(Collectors.toSet()));
			canMaked.add(now);
		}

		for(Integer mm : m) {
			if(canMaked.contains(mm)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}

	}
}