import java.util.*;
class Main
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			
			String s = sc.next();
			
			int s1 = s.charAt(0);
			int s2 = s.charAt(1);
			int s3 = s.charAt(2);
          	
          int total = 700;
          
          if(s1!='×'){
            total+=100;
          }
          if(s2!='×'){
            total+=100;
          }
          if(s3!='×'){
            total+=100;
          }
          
          System.out.println(total);
        }
}
