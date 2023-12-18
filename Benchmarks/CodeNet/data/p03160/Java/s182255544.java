import java.util.*;
public class Main {
  public static void main(String ... args) {
    	Scanner in = new Scanner(System.in);
    	int n  = in.nextInt();
      	int [] a = new int[n];
    	for(int i=0;i<a.length;i++) {
        	a[i] = in.nextInt();
        }
    	int min = 0;
    	for(int i=a.length-1;i>=0;) {
        	if(Math.abs(a[i]-a[i-1])<Math.abs(a[i]-a[i-2])) {
            	min+=Math.abs(a[i]-a[i-1]);
              	i--;
            }
            else {
              min+=Math.abs(a[i]-a[i-2]);
              i-=2;
            }
        }
    System.out.println(min);
  }
}