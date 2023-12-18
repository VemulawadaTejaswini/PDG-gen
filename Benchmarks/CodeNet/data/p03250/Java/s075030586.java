import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        int w = 0;
      if(b > a){
        w = a;
        a = b;
        b = w;
      }
      if(c > a){
        w = a;
        a = c;
        c = w;
      }
      if(c > b){
        w = b;
        b = c;
        c = w;
      }
      if(a >=b && c >= b){
        w = Integer.parseInt(String.valueOf(a)+String.valueOf(c));
		System.out.println(w+b);
        System.exit(0);
      }
      if(a >=c && b >= c){
		System.out.println(a*b+c);
        System.exit(0);
      }
      if(b >=a && c >= b){
		System.out.println(b*c+a);
        System.exit(0);
      }
	}
}