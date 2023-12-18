import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	  static int calcNumOfCombination(long n, int r){
	        return factorial(n) / (factorial(r) * factorial(n-r));
	    }
	    //nの階乗を計算
	  static  int factorial(long n){
	        int answer = 1;
		while(n > 1){
		    answer *= n;
		    n--;
		}
	        return answer;
	    }
	static boolean isAnagram(String s,String t){

        int[] letters = new int[256];

        char[] s_array = s.toCharArray();
        for(char c:s_array){
            letters[c]++;
        }

        for(int i=0;i<t.length();i++){
            int c = (int)t.charAt(i);
            if(--letters[c] < 0){
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> sarray = new ArrayList<>();
		long count = 0;
		long ans=0;
		for (int i = 0; i < n; i++) {
			sarray.add(sc.next());
		}

		for (int i = 0; i < n; i++) {
			count =0;
			for (int j = i+1; j < sarray.size(); j++) {
				if (isAnagram(sarray.get(i), sarray.get(j))) {
					count++;
					sarray.remove(j);
				}
			}
			count++;
			if(count>=2) {
			ans+=calcNumOfCombination(count,2);
			}
		}
		System.out.println(ans);
	}
}
