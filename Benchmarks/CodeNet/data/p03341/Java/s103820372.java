import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   	String s = sc.next();
    int count = 0;
    int count_min;
    
    for(int i = 1;i < n;i++){
      if(s.charAt(i) == 'E') count++;
    }
    count_min = count;
    for(int i = 0; i < n;i++){
      if(s.charAt(i) == 'E') count--;
      else count++;
      if(count < count_min) count_min = count;
    }
  	System.out.println(count_min);
    
    
  }
}
