public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	long num = Long.parseLong(br.readLine());
	List<Long> longArray = new ArrayList<Long>();
	while (num > 1) {
	    longArray.add(num % 26);
	    num /= 26;
	}
	for (int i = longArray.size() - 1; i >= 0; i--) {
	    System.out.println(longArray.size());
	    if (longArray.get(i) == 0) {
		System.out.print("z");
	    } else {
		System.out.print((char) ('a' + (longArray.get(i) - 1)));
	    }
	}
    }

}
