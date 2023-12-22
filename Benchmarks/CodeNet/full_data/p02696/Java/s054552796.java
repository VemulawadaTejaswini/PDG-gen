import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long n = scan.nextLong();
        long max = 0;
		List<Long> listA = new ArrayList<Long>(); 

		for (long x=1; x<n+1; x++) {
			listA.add((long)((a*x)/b) - (long)(x/b));
        }

		max = listA
      	.stream()
      	.mapToLong(v -> v)
      	.max().orElseThrow(NoSuchElementException::new);

		System.out.println(max);
	    scan.close();	
    }
}