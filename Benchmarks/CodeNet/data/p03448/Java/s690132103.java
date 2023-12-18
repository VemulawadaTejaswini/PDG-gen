import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int A = sc.nextInt();
  int B = sc.nextInt();
  int C = sc.nextInt();
  int X = sc.nextInt();
  int count = 0;
  for(int i = 0;i <= A;i++){
    for(int j = 0;j <= B;j++){
      for(int k = 0;k <= C;k++){
if(500*A + 100*B +50*C == X)count += 1;
      }
    }
  }
System.out.println(count);
}
}
  
