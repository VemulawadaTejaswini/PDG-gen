import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

	    int N = sc.nextInt();
        List<String> list = new ArrayList<>();
      
      for(int i ;i < N; i++){
        int prize = sc.next();
        if(list.indexOf(prize) == -1){
          list.add(prize);
        }
      }
      
      System.out.println(list.length);
      
    }
}
