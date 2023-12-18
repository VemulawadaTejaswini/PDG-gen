import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int[] a = new int[3];
      	int fiveCnt = 0;
      	int sevenCnt = 0;
      
      	for (int i = 0; i < 3; i++) {
      		a[i] = Integer.parseInt(sc.next());        
          	if (a[i] == 5) { fiveCnt++; }
          	if (a[i] == 7) { sevenCnt++; }
        }
      	if (fiveCnt == 2 && sevenCnt == 1) { System.out.println("Yes"); }
      	else { System.out.println("No"); }
      	
    }
}
