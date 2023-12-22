import java.util.Scanner;

public class Main {
	 public static void main(String[] args){
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        String t = scan.nextLine();
	        scan.close();

	        int count = 0;
	        int ans = 0;

	        for(int i=0;i<s.length()-t.length()+1;i++) {
	        	for(int j=0;j<t.length();j++) {
	        		if(s.charAt(i+j) == t.charAt(j)) {
	        			count++;
	        		}
	        	}
	        	ans = Math.max(ans,count);
        		count = 0;
	        }
	        System.out.println(t.length()-ans);
	    }
}

