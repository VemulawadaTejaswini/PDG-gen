import java.util.* ;
public class Main{
	public static void main(String []args){
    	Scanner sc = new Scanner(System.in);
      
        // System.out.println(sc.nextLine().replace(" " , "")) ; 
        String s1= sc.next();
       String s2 = sc.next() ; 
       String res = "" ; 
      for(int i = 0 ; i <s1.length() ;i++){
      	if(i%2 ==0  )
          res+=s1.charAt(i) ;
        else 
          res+= s2.charAt(i) ;
      }
      System.out.println(res ) ;
        
      
        
      
      
      
    }
 
 
}






























