import java.util.*;
import java.io.*;
 
public class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int[] a = new int[N];
	int count = 0;
	for(int i = 0; i < N; i++){
		a[i] = s.nextInt();
		if((i+1)%2==1 && a[i]%2==1) count++;
	}

	System.out.println(count);
    
  }
}