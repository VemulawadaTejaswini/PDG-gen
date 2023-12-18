import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int N = scan.nextInt();
    
    int count = 0;
    for (int i = 1; i < N+1; i++){
      for (int j = 1; j < N+1; j++){
        String first = String.valueOf(i);
        String second = String.valueOf(j);
        
        String ftail = first.substring(first.length()-1, first.length());
        String fhead = first.substring(0, 1);
        
        String stail = second.substring(second.length()-1, second.length());
        String shead = second.substring(0, 1);
        
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