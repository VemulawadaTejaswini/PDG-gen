import java.util.*;
import java.util.Arrays;
 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	int[] t = new int[3];
  		t[0] =Integer.parseInt(sc.next());
  		t[1] =Integer.parseInt(sc.next());
  		t[2] =Integer.parseInt(sc.next());
  		Arrays.sort(t);
  		if(t[0]%2==1 && t[1]%2==1 && t[2]%2==1){
  			/*int max= t[1]*(t[2]-1);
  			int min= t[0]*t[1];*/
  			System.out.println((t[0]*t[1]));
  		}else{
  			System.out.println(0);
  		}

    }
}

