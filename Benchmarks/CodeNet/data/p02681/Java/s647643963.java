import java.util.*;
	public class Solution{
 		public static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args)
        {
          String S = scanner.nextLine();
          String T = scanner.nextLine();
          if(res(S,T)){
            System.out.println("Yes");
          }
          else{
            System.out.println("No");
          }
          
          
        }
    public static boolean res(String S , String T){
      if(S.eqauls(""))
          {
            return true;
          }
          if(S.length() > T.length()){
            return false;
          }
          
            String res = "";
            int arr[] = new int[128];
            
            for(char t : T.toCharArray()){
              ++arr[t];
            }
            
            for(char s : S.toCharArray()){
              --arr[s];
                if(arr[s] < 0)
                {
                 return false; 
                }
            }
            
           return true;
    }
}