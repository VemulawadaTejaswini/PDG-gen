import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String[][] c = new String[2][3];
      for(int i = 0;i < 2;i++){
      	for(int j = 0;j < 3;j++){
        	c[i][j] = sc.next();
        }
      }
      if( c[0][0].equals(c[1][2])&&c[0][1].equals(c[1][1])&&c[0][2].equals(c[1][0]) ){
      	System.out.println("YES");
      }else{
      	System.out.println("NO");
      }
    }
}
