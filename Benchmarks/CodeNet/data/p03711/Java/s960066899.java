import java.util.*;
 
public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      
      int groupX = getGroup(x);
      int groupY = getGroup(y);
      
      if (groupX == groupY){

        System.out.print("Yes");
      }
      else{
        System.out.print("No");
      }
	}
  
  	public static int getGroup( int input ){
      int group1[] = {1,3,5,7,8,10,12};
      int group2[] = {4,6,9,11};
      int group3[] = {2};
      
      if (check( input, group1))	return 1;
      if (check( input, group2))	return 2;
      if (check( input, group3))	return 3;
         
      return 0;
    }
    public static boolean check( int input, int group[] ){
   
      for ( int n = 0; n < group.length; n++ ){
        if ( group[n] == input ){
         return true; 
        }
      }
      return false;
    }
}