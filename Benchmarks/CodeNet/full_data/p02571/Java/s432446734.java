import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        String[] TEMP = T.split("");
        String[] TEMP_S = S.split("");

        int count = 0;
        for (int i = 0; i < TEMP_S.length - TEMP.length +1; i++) {
    		int temp = 0;
        	for (int j = 0; j < TEMP.length; j++) {
        		if (TEMP_S[i + j].equals(TEMP[j])) {
        			temp++;
        		}
        	}
    		if (temp > count) {
    			count = temp;
    		}
        }

        System.out.println(T.length() -count);
    }
}