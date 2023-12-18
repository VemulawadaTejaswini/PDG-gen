
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static String sort(String s){
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    static boolean permutation(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
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
			for(int j=i+1; j<N;j++) {
				if(permutation(array.get(i),array.get(j))==true) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}
