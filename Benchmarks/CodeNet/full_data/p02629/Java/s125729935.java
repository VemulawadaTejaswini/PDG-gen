import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
	    Scanner sc = new Scanner(System.in);
		long N=sc.nextLong();
		ArrayList<String> ans = new ArrayList<String>();
		while(N>0){
		    N--;
		    int temp;
		    temp= 'a'+(int) N%26;
		    String t = String.valueOf(Character.toChars(temp));
		    ans.add(0,t);
		    N/=26;
		}
		for(String a:ans) {
			System.out.print(a);
		}
	}
}
