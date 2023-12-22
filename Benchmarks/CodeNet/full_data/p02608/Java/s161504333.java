import java.util.*;
import java.io.*;
 
public class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	for(int i = 1; i <= N; i++){
		int count = 0;
		for(int x = 1; x <= 100; x++){
			for(int y = 1; y <= i-x*x; y++){
				for(int z = 1; z <= i-x*x-y*y; z++){
					if(x*x+y*y+z*z+x*y+y*z+z*x==i) count++;
				}
			}
		}
		System.out.println(count);
	}
    
  }
}