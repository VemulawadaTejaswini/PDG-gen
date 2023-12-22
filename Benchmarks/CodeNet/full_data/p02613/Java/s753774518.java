public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int C0 = 0;
		int C1 = 0;
		int C2 = 0;
		int C3 = 0;
		
		int N = scan.nextInt();
		for(int i=1; i<=N; i++) {
			String S = scan.next();
			
			switch(S) {
			case "AC":
				C0+=1;
				break;
			case "WA":
				C1+=1;
				break;
			case "TLE":
				C2+=1;
				break;
			case "RE":
				C3+=1;
				break;
			}
		}
		
		System.out.println("AC ×　"+C0);
		System.out.println("WA ×　"+C1);
		System.out.println("TLE ×　"+C2);
		System.out.println("RE ×　"+C3);
		
	}

}