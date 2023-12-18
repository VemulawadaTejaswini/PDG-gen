
import java.util.*;

class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a = sc.nextInt();
int b = sc.nextInt();
  if ((b-a)%2==0){
System.out.println((b-a)/2);
}else{
int c = Math.max(a-1,b-1);
int d = Math.max(n-a,n-b);
int f = Math.min(c,d);
System.out.println(f);
}
}
}
