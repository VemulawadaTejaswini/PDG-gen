import java.util.*;
public class Main {
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
  int n = sc.nextInt();
  int[] ints = new int[1001];
  for (int i=2;i < n+1;i++){
    int y = 2;
    int z = i;
    while(z > 1){
      if(z%y==0){
        z/=y; 
        ints[y]++;
      }
      else if(z%y!=0)y++;
    }
  }
  long ans = 1;
  for(int i=1;i<1001;i++){
    if (ints[i]!=0) {ans = ans*(ints[i]+1)%1000000007;}
  }
  System.out.println(ans);
}}