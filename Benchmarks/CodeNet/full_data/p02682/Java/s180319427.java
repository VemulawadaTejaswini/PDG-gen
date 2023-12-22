import java.util.*;
class Main{
    public static void main(String args[]){
        int plusOne = args[0];
        int zero = args[1];
	    int minusOne = args[2];
      	int amount = args[3];
		int ans = 0;
      for (int i=0; i<amount; i++) {
      	if (i < plusOne) {
        	ans = ans + 1;
        } else if (i < plusOne + zero) {
        	ans = ans;
        } else {
        	ans = ans - 1;
        }
      }

      System.out.println(ans);

    }
}