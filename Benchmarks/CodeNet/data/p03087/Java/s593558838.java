import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split(" ",0);
    int N = Integer.parseInt(s[0]);
    int Q = Integer.parseInt(s[1]);
    String s1 = sc.nextLine();
    String buf = "";
    int cnt = 0;
    int a = 0;
    int b = 0;
    for (int i = 1;i < N;i++){
      s1 = s1.replaceAll("AC","aC");
     
    }
    int[] num = new int[Q];
    for (int i = 0;i < Q;i++) {
		s = sc.nextLine().split(" ",0);
        a = Integer.parseInt(s[0]) -1;
      	b = Integer.parseInt(s[1]);
      	buf = s1.substring(a,b);
        if ('a' == buf.charAt(buf.length() - 1)) {
          	num[i] = buf.length() - buf.replaceAll("a","").length() - 1;
        } else {
         	num[i] = buf.length() - buf.replaceAll("a","").length();
        }
    }
    for (int i = 0;i < Q;i++){
     System.out.println(num[i]); 
    }
  }

}
