import java.util.*;
 
class Main {
 
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int[] fromAnt;
    int[] toAnt;
    
    for(int i = 0; i < 5; i++) {
      fromAnt[i] = sc.nextInt();
      toAnt[i] = fromAnt[i];
    }
    int k = sc.nextInt();
    
    for(int i = 0; i < 5; i++) {
      for(int j = i+1; j < 5; j++) {
        if(toAnt[j] - fromAnt[i] > k) {
          System.out.println(":(");
          return;
        }
      }
    }
    
    System.out.println("Yay!");
	return;    
  }
 
}