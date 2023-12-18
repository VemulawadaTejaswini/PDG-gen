import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
        int count = 0;
        for (int i=1; i<=n; i++) {
        	if (isShichiGoSanNum(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isShichiGoSanNum(int num) {
        String numStr = Integer.toString(num);
        boolean[] found = new boolean[3];
        for (char digit : numStr.toCharArray()) {
        	if (digit == '3') {
            	found[0] = true;
                if (found[0] && found[1] && found[2]) { return true; }
            } else if (digit == '5') {
            	found[1] = true;
                if (found[0] && found[1] && found[2]) { return true; }
            } else if (digit == '7') {
            	found[2] = true;
                if (found[0] && found[1] && found[2]) { return true; }
            } else {
                return false;
            }
        }
        return found[0] && found[1] && found[2];
    }
}