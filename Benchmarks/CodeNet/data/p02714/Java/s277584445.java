import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String num = sc.nextLine();
		char[] work = new char[num.length()];
		int cnt = 0;
	    for(int i = 0; i < num.length(); i++){
	    	for(int j = i+1; j < num.length(); j++){
	    		for(int k = j+1; k < num.length(); k++){
	    			if(j-i != k-j) {
	    				if(num.charAt(i) != num.charAt(j) && num.charAt(i) != num.charAt(k) && num.charAt(k) != num.charAt(j)) {
	    					cnt += 1;
	    				}
	    			}
	    	    }
		    }
	    }
	    System.out.println(cnt);
	}
}
