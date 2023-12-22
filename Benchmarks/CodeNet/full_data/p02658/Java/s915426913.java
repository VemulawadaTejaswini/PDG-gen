import java.util.*;
import java.io.*;
 
class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long result = 1;
    boolean flag = true;
    long temp = 0;
    
    for(int i = 0; i < n; i++) {
        temp = sc.nextLong();
      	int valLen = String.valueOf(temp).length(); 
      	int resLen = String.valueOf(result).length();
      	System.out.println(valLen + " " + resLen);
      	if(temp == 0) {
            System.out.println(0);
            System.exit(0);
        }
        if(flag) {
          	result = result*temp;
          	if(result > Math.pow(10,18) || valLen+resLen >= 20) flag = false;
        }
    }
    
    if(flag) System.out.println(result);
    else System.out.println(-1);
  }
}