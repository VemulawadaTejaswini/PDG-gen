import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int N = scan.nextInt();
    
    Map<String, String> map = new HashMap<>(); 
    for (int i = 1; i < N+1; i++){
      String first = String.valueOf(i);
      String ftail = first.substring(first.length()-1, first.length());
      String fhead = first.substring(0, 1);
      
      map.put(i + "t", ftail);
      map.put(i + "h", fhead);
    }
    
    int count = 0;
    for (int i = 1; i < N+1; i++){
      String ftail = map.get(i + "t");
      String fhead = map.get(i + "h");
      
      for (int j = 1; j < N+1; j++){
        
        String stail = map.get(j + "t");
        String shead = map.get(j + "h");
        
        if (fhead.equals(stail)){
          if (ftail.equals(shead)){
            count++;
          }
        }
      }
    }
    
    System.out.println(count);
  }
}