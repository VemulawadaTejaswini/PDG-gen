public class Main {
	public static void main(String[] args) {
		if (args.length > 10000) {
			throw new IllegalArgumentException();
		}
		List<String> asList = Arrays.asList(args);
		Collections.reverse(asList);
		for(int i =0;i<3;i++){
			System.out.println(asList.get(i));
		}
	}
}