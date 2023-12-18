import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
      	int N = s.nextInt(), Q = s.nextInt();
      	String S = s.next();
      	int[] AC = new int [N];
      	AC[0] = 0;
      	for (int i = 1; i < N; i++){
        	if (S.substring(i - 1, i + 1).equals("AC") AC[i] = 1;
    		else AC[i] = 0;
        }
		for (int i = 0; i < Q; i++){
          	int n = 0, l = s.nextInt(), r = s.nextInt();
        	for  (int j = l; j < r; j++){
            	n += AC[j];
            }
          	System.out.println(n);
        }
    }
}