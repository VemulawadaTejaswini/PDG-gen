public class Main {
	
  	private static int keisan(int n, int a, int b) {
      
      int j;
      j = n * a;
      
      if (j > b) {
       	return b; 
      } else {
        return j; 
      }
      
    }
  
	public static void main(String[] args) {
        
        
        System.out.println(keisan(4,2,9));
        System.out.println(keisan(4,2,7));
        System.out.println(keisan(4,2,8));
      
      
	}
 
 
}