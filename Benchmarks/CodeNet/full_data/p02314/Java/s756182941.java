import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while ( sc.hasNextInt() ) {
      int target = sc.nextInt();
      int count = sc.nextInt();
      int[] denominations = new int[count];
      for ( int i = 0; i < count; i++ ) {
        denominations[i] = sc.nextInt();      
      }
      System.out.println(findMinimumNumberofCoins(target, denominations));
    } 
  }

  public static int findMinimumNumberofCoins(int target, int[] denominations) {
    
    int[] cache = new int[target+1];

    for ( int i = 1; i <= target; i++ ) {
      int min = i;
      for ( int denomination : denominations ) {
        if ( i - denomination >= 0 ) {
          min = Math.min(min, cache[i-denomination]);
        }
      }
      // loop through all denominations and update the min  
      cache[i] = min+1;
    }
    return cache[target];
  }
  
} 