
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		char[] letters = scanner.next().toCharArray();
		int ans = 0;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			if (letters[i]=='I') {
				count++;
			}else {
				count--;
			}
			if (count>ans) {
				ans = count;
			}
		}
		
		System.out.println(ans);
		scanner.close();
	}

}