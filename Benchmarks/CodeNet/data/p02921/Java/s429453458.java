import java.io.*;
import java.util.*;
public class Atcoderone{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
  		String s = sc.next();
  		String t = sc.next();
  		int c=0;
  		for(int i=0;i<3;i++){
  			for(int j=0;j<3;j++){
  				if(s.charAt(i) != t.charAt(j))
  					c++;
  				break;
  			}
  		}
  		System.out.print(c);
    }
}