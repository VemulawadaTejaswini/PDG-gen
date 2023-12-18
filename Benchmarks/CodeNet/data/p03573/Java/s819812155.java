public class Main {
    public static void main(String[] args) {
      
      String[] str = args[0].split(" ", 0);
 
		int x = Integer.parseInt(str[0]);
  		int y = Integer.parseInt(str[1]);
  		int z = Integer.parseInt(str[2]);
      	
        int ans = x;
  		if (x == y) {
    		ans = z;
  		} else if (x == z) {
   			ans = y;
  		}
 		System.out.println(ans);
    }