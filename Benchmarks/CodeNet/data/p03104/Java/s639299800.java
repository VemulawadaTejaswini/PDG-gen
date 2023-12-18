import java.util.*;
class Main{
	public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      long a = s.nextLong() , b = s.nextLong();
      if(a == b)
        System.out.println(a);
      else if(a%2 == 0){
        if(b-a == 1)
          System.out.println(a^b);
        else if(((b-a)/2)%2 == 0)
          System.out.println(b);
        else
          System.out.println(1^b);
      }
      else if(a%2 != 0){
        if(b-a == 1)
          System.out.println(a^b);
        else if(((b-a)/2)%2 == 0)
          System.out.println(a);
        else
          System.out.println(1^a);
  		    
      }
   }
}
          
      
          	
			