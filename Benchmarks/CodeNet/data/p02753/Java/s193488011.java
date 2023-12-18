import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);

        String s = sc.next();
        sc.close();
        char t = s.charAt(0);

        for (int i = 1; i < 3; i++) {
            if(t != s.charAt(i)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

}
