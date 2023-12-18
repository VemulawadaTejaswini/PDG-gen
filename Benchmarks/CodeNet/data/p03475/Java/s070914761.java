import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
  int N = sc.nextInt();
  int[] c = new int[3*(N-1)];
  for(int i = 0;i < 3*(N-1);i++){
    c[i] = sc.nextInt();
  }
   for(int j = 0;j < 3*(N-1);j += 3){
	  int sum = 0;
  for(int i = j;i < 3*(N-1);i += 3){
    if(sum < c[i+1]){
      sum = c[i+1] + c[i];
    }
    else{
      sum += (sum-c[i+1])%c[i+2] + c[i];
    }
  }
  System.out.println(sum);
  }
  System.out.println("0");
}}