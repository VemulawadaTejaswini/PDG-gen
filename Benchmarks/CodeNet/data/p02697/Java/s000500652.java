import java.util.*;

public class Main {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int n = Integer.parseInt(scan.next());
      int m = Integer.parseInt(scan.next());
      scan.close();

      for(int i=0;i<m;++i){
      	if(n%2==0)
          System.out.println(i+1 + " "+ (n-i));
     	 else
           System.out.println(i+1 + " "+ (n-1-i));     
      }
    }
}