
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue; 
import java.util.*;

public class Main {

	public static void main(String argv[]) {

        Scanner in = new Scanner(System.in);
        int numTask = in.nextInt();
        int maxTime = in.nextInt();
        int curr=0;
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Queue<String> q = new LinkedList<>();
     // accessing the numbers in the second line
        for (int i = 0; i < numTask; i++){
//        	String str = in.nextLine();
        	q.add(in.nextLine());
        }

        while(q.size() > 0){
        	  String element = q.remove();
        	  String[] oneTask = element.split(" ");
        	  int timeDiff = Integer.parseInt(oneTask[1]) - maxTime;
        	  if(timeDiff<=0)
        	  {
        		  curr = curr + Integer.parseInt(oneTask[1]);
        		  System.out.println(oneTask[0] + ' ' + curr);
        	  }
        	  else
        	  {
        		  curr = curr + maxTime;
        		  oneTask[1] = Integer.toString(timeDiff);
        		  q.add(oneTask[0] + ' ' + oneTask[1]);
        	  }
        }

        in.close();
    }
}

