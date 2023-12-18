import java.util.*;
import java.lang.Math;

public class Main {
  
  public static int kp(int num) {
    if(num != 1) return num + kp(num-1);
    else return 1;
  }
  public static int km(int num) {
    if(num != 1) return num * km(num-1);
    else return 1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x[] = new int[n];
    int y[] = new int[n];
    double dis = 0;
    double dstack;
    double num;
    
    num = (n-1)/(double)kp(n-1);
      
    for(int i = 0;i < n;i++){
    	x[i] = sc.nextInt();
      	y[i] = sc.nextInt();
    }
    
    for(int i = 0;i < n; i++){
      for(int j = i+1;j < n;j++){
        dstack = Math.pow(x[i]-x[j],2) + Math.pow(y[i]-y[j],2);
        dis += Math.sqrt(dstack);
      }   	
    }
    
    dis *= num; 
    
    System.out.println(dis);
  }
}
