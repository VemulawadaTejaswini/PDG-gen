
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static String sort(String s){
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String nu = sc.nextLine();
		ArrayList<String> array = new ArrayList<String>();
		for(int i = 0; i < N;i++) {
			array.add(sc.nextLine());
		}
		//System.out.println(permutation(array.get(0),array.get(2)));
		int ans = 0;
		for(int i=0; i<N-1;i++) {
			String tmp = sort(array.get(i));
			for(int j=i+1; j<N;j++) {
				if(tmp.equals(sort(array.get(j)))) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}
