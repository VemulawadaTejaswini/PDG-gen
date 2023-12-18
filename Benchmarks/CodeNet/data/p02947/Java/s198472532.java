
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        main1(sc);
    }

    public static void main1(Scanner sc) {

    	int num = sc.nextInt();

    	ArrayList<char[]> list1 = new ArrayList<char[]>(num);
    	for (int i = 0; i < num; i++) {
    		char[] tmp = sc.next().toCharArray();
    		Arrays.sort(tmp);
    		list1.add(tmp);
    	}

    	int cnt = 0;
    	int len = list1.size();
    	for (int i = 0; i < len; i++) {
    		char[] tmp1 = list1.get(i);

    		if (tmp1[0] == 0) {
    			continue;
    		}

    		int subcnt = 0;
    		for (int j = i + 1; j < len; j++) {
    			char[] tmp2 = list1.get(j);

        		if (tmp2[0] == 0) {
        			continue;
        		}

    			if (Arrays.equals(tmp1, tmp2)) {
    				subcnt++;
    				tmp2[0] = 0;
    			}
    		}

    		if (subcnt > 1) {
    			cnt += calcNumOfCombination(subcnt + 1, 2);
    		} else {
    			cnt += subcnt;
    		}
    	}

    	System.out.println(cnt);

    }

    static int calcNumOfCombination(int n, int r){
        return factorial(n) / (factorial(r) * factorial(n-r));
    }
    //nの階乗を計算
    static int factorial(int n){
        int answer = 1;
		while(n > 1){
		    answer *= n;
		    n--;
		}
        return answer;
    }

	public static void maina(String[] args) throws Exception {
		String in1 = "3\r\n" +
				"acornistnt\r\n" +
				"peanutbomb\r\n" +
				"constraint";

		String in2 = "2\r\n" +
				"oneplustwo\r\n" +
				"ninemodsix";

		String in3 = "5\r\n" +
				"abaaaaaaaa\r\n" +
				"oneplustwo\r\n" +
				"aaaaaaaaba\r\n" +
				"twoplusone\r\n" +
				"aaaabaaaaa";

		Scanner sc = new Scanner(new ByteArrayInputStream(in1.getBytes()));
		main1(sc);

		sc = new Scanner(new ByteArrayInputStream(in2.getBytes()));
		main1(sc);

		sc = new Scanner(new ByteArrayInputStream(in3.getBytes()));
		main1(sc);
	}
}