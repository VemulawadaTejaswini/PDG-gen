import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
		String n2 = sc.nextLine();
		if (n1.length() + 1 != n2.length()) {
			System.out.println("No");
		}else{
			String[] n1sp = n1.split("");
			String[] n2sp = n2.split("");
			for (int i = 0; i < n1.length(); i++) {
				if (n1sp[i] != n2sp[i]){
				continue;
				}else{
				System.out.println("No");
				break;
				}
			}
			System.out.println("Yes");
		}
    }
}