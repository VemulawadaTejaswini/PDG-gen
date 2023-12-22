import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String str = "";

        while(sc.hasNext()) {
        	str += sc.nextLine();
        }
        str = str.toLowerCase();

        char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k',
        							  'l','m','n','o','p','q','r','s','t','u','v',
        							  'w','x','y','z'};

        int[] ans = new int[alphabet.length];

        for(int i = 0; i < str.length(); ++i) {
        	for(int j = 0; j < alphabet.length; j++) {
        		if(str.charAt(i) == alphabet[j]) {
        			ans[j]++;
        		}
        	}
        }

        for(int i = 0; i < alphabet.length; i++) {
        	System.out.println(String.format("%s : %d", alphabet[i], ans[i]));
        }

    }
}
