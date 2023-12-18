import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int A = sc.nextInt();
  int B = sc.nextInt();
  int count = 0;
  int c = 10000;
  int[] d = new int[5];
  for(int i = A;i<=B;i++){
    for(int j = 1;j<=5;j++){
      d[j] = i/c;
      i %= c;
      c /= 10;
    }
    if(d[1] == d[5]&& d[2] == d[4]){count += 1;}
  }
    System.out.println(count);
}
}
      
    
