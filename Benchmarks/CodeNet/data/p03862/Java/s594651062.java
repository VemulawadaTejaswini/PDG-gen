import java.util.Scanner;
public class Main{
 
  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int ops = 0;
    int[] candies = new int[n];
    for(int i = 0; i < n; i++){
      candies[i] = sc.nextInt(); 
    }
    for(int i = 0; i < n - 1; i++){
      int diff = (candies[i] + candies[i + 1]) - x;
      if (diff > 0){
        ops += diff;
        if (diff < candies[i + 1]){
         candies[i + 1] -= diff; 
        }
        else{
         candies[i + 1] = 0; 
        }
      }
    }
    System.out.println(ops);
    sc.close();
    
  }
  
}