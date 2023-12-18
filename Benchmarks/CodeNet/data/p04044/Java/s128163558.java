import java.util.*;

public class Main{
  
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    List<String> array = new ArrayList<String>();
        
    for(int i=0;i<N;i++){
      String tmp = sc.next();
      array.add(tmp);
    }
    
    Collections.sort(array);
    
    String output = "";
    
    for(int i=0;i<N;i++){
      output += array.get(i);
    }
    
    System.out.println(output);
  }
}

      