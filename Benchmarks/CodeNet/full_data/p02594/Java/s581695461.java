import java.util.*;

class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	//int[] A = new int[n];
      	//for (int i = 0; i < n; i++) {A[i] = Integer.parseInt(sc.next());}
      	String str;
      	if (n >= 30) {
          str = "Yes";
        } else {str = "No";}
      	System.out.println(str);
    }
}