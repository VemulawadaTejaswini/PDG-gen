import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int H = sc.nextInt();
	      int W = sc.nextInt();
	      int board[][] = new int[H + 2][W + 2];
	      for(int i = 1; i <= H; i++) {
	    	  	String HW = sc.next();
	    	    for(int j = 1; j <= W; j++) {
	    	    	  if(HW.charAt(j - 1) == '#') {
	    	    		  board[i][j] = 1;
	    	    	  }
	    	    }
		  }
	      sc.close();
	      
	      boolean flag = false;
	      
	      for(int i = 0; i < H + 2; i++) {
	    	    for(int j = 0; j < W + 2; j++) {
	    	    	  if(board[i][j] == 1) {
	    	    		  if(board[i][j + 1] == 0 && board[i][j - 1] == 0 && board[i + 1][j] == 0 && board[i - 1][j] == 0) {
	    	    			  flag = true;
	    	    			  break;
	    	    		  }
	    	    	  }
	    	    }
		  }
	      
	      if(flag == true) {
	    	  	System.out.println("No");
	      }else {
	    	  	System.out.println("Yes");
	      }
	      
	      System.exit(0);
	    }
}