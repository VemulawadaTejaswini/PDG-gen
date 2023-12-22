import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    	
    	int K = scan.nextInt();
    	String S = scan.next();
    	
    	if(S.length()>K && K>=1 && K<=100 && S.length()>=1 && S.length()<=100){
        	S = S.substring(0,K);
        	System.out.println(S+"...");
        
        }else if(S.length()<K && K>=1 && K<=100 && S.length()>=1 && S.length()<=100){
          	System.out.println(S);
        }  
  	}
  }