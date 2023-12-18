import java.util.Scanner; 
 
class Solution{
  public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      String s = scan.next();
    	for (int i = 0; i < s.length(); i++){
        	if(s.charAt(i) == '7'){
            	System.out.println("Yes");
            return;
            }
        }
              System.out.println("No");
    return;
        }
}