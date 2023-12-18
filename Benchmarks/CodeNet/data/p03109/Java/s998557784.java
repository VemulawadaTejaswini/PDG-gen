import java.util.*;

public class Main{
  
  public static void main (String[] args){
    
    Main main = new Main();
    main.solve();
  }
  
  private void solve(){
    
    Scanner scanner = new Scanner (System.in);
    
    String dates = scanner.nextLine();
    
    char month1 = dates.charAt(5);
    char month2 = dates.charAt(6);
    
    if (month1=='0'){
    	if (month2=='1'||month2=='2'||month2=='3'||month2=='4'){
			System.out.println("Heisei");
    	} else {
      		System.out.println("TBD");
    	}
    } else {
      System.out.println("TBD");
    }
  }
}