public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dataSet = Integer.parseInt(scanner.nextLine());
		List<String[]>  l = new ArrayList<>();
		
		for (int i = 0; i < dataSet; i++) {			
			String[] s = scanner.nextLine().split(" ");
			l.add(s);
		}
		for(int i = 0; i<l.size();i++){
			String[] s = l.get(i);
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			
			int digitsA = Integer.valueOf(a).toString().length();
			int digitsB = Integer.valueOf(b).toString().length();
			
			System.out.println(digitsA+digitsB);
		
	}
	}
}