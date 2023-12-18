import java.util.*;
import java.io.*;

public class Main {
  
 public static void main(String[] args){
  	Scanner s = new Scanner(System.in); 
  	int a = 0;
    int q = 0;
   
   	for (int i = 0;i < 3;i++) {
     	if (s.nextInt() == 5) a++;
        else if (s.nextInt() == 7) q++;
    }
   	if (a == 2 && q == 1) System.out.println("YES");
    else System.out.println("NO");
  }
}
  