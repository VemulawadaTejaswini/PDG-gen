import java.util.*;

public class Main {
	
	public static void main(String[] args) {
      
      List<Integer> arr = new ArrayList<Integer>();
      
	  Scanner sc = new Scanner(System.in);
      
      int result = 0;
      
      int n = sc.nextInt();
      
      for (int i=0; i<n; i++) {
          arr.add(sc.nextInt());
      }
      
      for (int i = 0; i < arr.size(); i++) {
          for (int j = i; j < arr.size(); j++) {
              if (arr.get(i) != arr.get(j)) {
                  result = result + (arr.get(i) * arr.get(j));
              }
          }
      }
      
      System.out.println(result);
       
	} 
  
}