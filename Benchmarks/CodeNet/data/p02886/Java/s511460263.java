import java.util.ArrayList;
import java.util.Scanner;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    String str = sc.next();
    ArrayList<Integer> di = new ArrayList<>();

    for(int i = 0; i< str.length(); i++){
    	String s = String.valueOf(str.charAt(i));
    	if(Integer.valueOf(s) > 0) {
    		di.add(Integer.valueOf(s));
    	}
    }

    int count = n * (n - 1) / 2;

    ArrayList<Integer> sa = new ArrayList<>();
    ArrayList<Integer> ka = new ArrayList<>();
    ka = (ArrayList<Integer>) di.clone();

    for(int i = 0; i < di.size();i++){
    	ka.remove(0);
    	for(int j =0; j  < ka.size(); j++) {
    		sa.add(di.get(i) * ka.get(j));
        	}
    	}

    int ans = 0;
	for(int a:sa) {
		ans += a;
	}
	System.out.println(ans);
  }
}