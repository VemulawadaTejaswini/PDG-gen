import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
	  long amount = 100;
		long count = 0;
      	while(amount <X){
          amount = (long)(amount*1.01);
            count++;
        } 
      System.out.println(count);
}
}