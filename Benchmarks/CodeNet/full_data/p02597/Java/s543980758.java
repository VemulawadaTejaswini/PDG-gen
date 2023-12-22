import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    char temp;
    int w=0, r=0, min=100;
    int[] max = new int[n+1];

    List<Character> wr = new ArrayList<>();

    for(int i=0; i<n; i++){
      wr.add(str.charAt(i));
      if (wr.get(i)=='R')
    	  r++;
    }
	max[0] = Math.max(w, r);

    for(int i=1; i<n+1; i++) {
    	max[i] = Math.max(w, r);
    	if (wr.get(i-1) == 'W')
    		w++;
    	else
    		r--;
    }

    for(int i=0; i<n+1; i++) {
    	if (max[i] < min)
    		min = max[i];
    }
    System.out.println(min);

    sc.close();
  }
}
