import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] v = {1,2,3,4,5,6,7,8,9};
		Arrays.stream(v).forEach(x -> {
			Arrays.stream(v).forEach(y -> {
				System.out.println(x+"x"+y+"="+x*y);
			});
		});
	}

}

