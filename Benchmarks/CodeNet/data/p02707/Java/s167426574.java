import java.util. *;

	
class Main {


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        String a = "";
        for (int i = 0; i < N-1; i++) {
			a = a + sc.next();
		}
        
        for (int i = 0; i < N - 1; i++) {
        	int temp_sum = a.length();
			a = a.replaceAll(String.valueOf(i+1), "");
			System.out.println(temp_sum - a.length());
		}
        System.out.println(0);
	}
}
