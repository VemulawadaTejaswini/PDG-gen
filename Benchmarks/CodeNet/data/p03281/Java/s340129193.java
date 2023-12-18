import java.util.*;
 
class Main {
static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args){
	int n = scan.nextInt();  
    int count = 2;
    int ans = 0;
    
    for(int kisuu = 1; kisuu <= n ;kisuu + 2)
    {
      for(int yakusuu = 3 ;yakusuu < n ; yakusuu + 2){
      if( kisuu % yakusuu == 0){count += 1;  }
      }
      if (count == 8)(ans += 1;)
    }
    
    System.out.println(ans);
  }