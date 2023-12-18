import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        int blue = 0; int red = 0;

        for(int i = 0;i<N;i++){
      if(c[i] == 'R'){red++;}
      if(c[i] == 'B'){blue++;}
}
 if(red>blue){System.out.print("Yes");}
else{System.out.print("No");}
 

	}
}