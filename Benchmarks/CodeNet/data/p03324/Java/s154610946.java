import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int n = sc.nextInt();
    int ans = 1;
    for(int i=0;i<d;i++){
      ans *= 100;
    }
    int happy = ans*n;
    if(happy==100){
      ans += happy;
    }
    System.out.println(happy);
  }
}
