java.util.*
public class Main {
	private static void main(void) {
    	Scanner sc = new Scanner(System.in);
        String S = next(sc);
        if (S.length != 3) {
			PrintNo();
			return;
        }
        int anum = 0;
        int bnum = 0;
        for (int i = 0; i < 3; i++) {
	        if (S.substring(i,i+1).equals("A") == false &&
	            S.substring(i,i+1).equals("B") == false ) {
                PrintNo();
                return;
            }
            if (S.substring(i,i+1).equals("A")) {
            	a++;
                continue;
            }
			b++;
        }
        if (a == 0 || b == 0) {
            PrintNo();
            return;
        }
        PrintYes();
        return;
    }
    private static void PrintYes(void) {
        System.out.println("Yes");
	}
    private static void PrintNo(void) {
        System.out.println("No");
	}
}