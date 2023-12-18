import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static String sort(String s){
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String nu = sc.nextLine();
		int ans = 0;
		for(int i = 0; i < N;i++) {
			String tmp = sort(sc.nextLine());
			if(hashmap.isEmpty()) {
				hashmap.put(tmp,null);
			}else if(hashmap.containsKey(tmp)==true) {
				ans++;
			}else {
				hashmap.put(tmp,null);
			}
		}

		System.out.println(ans);
	}

}