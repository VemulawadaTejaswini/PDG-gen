import java.util.*;
 
public class Main
{
  public static void main(String args[]) {
 Scanner sc =new Scanner(System.in);
  	int n = sc.nextInt();
  	int[]a = new int[n];
  	for(int i =0;i <a.length; i++) {
  		a[i] = sc.nextInt();
  	}
  	Arrays.sort(a);
  	int sum = 0;
  	for(int i =0; i<a.length-1; i++) {
  		sum= sum + a[i];
  		
  	}
  	if(sum<=a[a.length-1]) {
  		System.out.println("No");
  	}
  	else {
  		System.out.println("Yes");
  	}
  	
  }
  
}