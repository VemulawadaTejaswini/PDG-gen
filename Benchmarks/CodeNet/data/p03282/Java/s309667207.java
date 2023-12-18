import java.util.*;
 
class Main {
static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args){
	int S = scan.next();
	int K = scan.nextInt();
    int oneCount = 0;
    String ans = null;
    
    while("1".equals(S.substring(i,(i+1)))){oneCount += 1;}
	if(oneCount >= K){ans = "1";}
    else{ ans = S.substring((oneCount-1),oneCount); }
    
    System.out.println(ans);
  }
}
