import java.util.Scanner;

public class Main {
	static boolean isAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        
        int[] letters = new int[256]; //文字コードの仮定;
        
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
		String[] sarray = new String[n];
		long count = 0;

		for (int i = 0; i < n; i++) {
			sarray[i]=sc.next();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (isAnagram(sarray[i], sarray[j])==true) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
