import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      int N = sc.nextInt();
	      int K = sc.nextInt(); 
	      List<Integer> scoreList = new ArrayList<>();
	      List<Integer> hyouteiList = new ArrayList<>();
	      
	      for(int i = 0; i < N; i++) {
	    	  scoreList.add(sc.nextInt());
	      }
	      
	      for(int i = K; i <= N; i++) {
	    	  int sum = 1;
	    	  for(int j = 0; j < K; j++) {
	    		  sum *= scoreList.get(i - K + j);
	    	  }
	    	  hyouteiList.add(sum);
	      }
	     
	      
	      PrintWriter out = new PrintWriter(System.out);
	      for(int i = 0; i < N - K; i++) {
	    	  if(hyouteiList.get(i + 1) - hyouteiList.get(i) == 0) {
	    		  out.println("No");
	    	  }else if(hyouteiList.get(i + 1) - hyouteiList.get(i) > 0) {
	    		  out.println("Yes");
	    	  }else {
	    		  out.println("No");
	    	  }
	      }
	      
	      out.flush();

	      
	}

}
