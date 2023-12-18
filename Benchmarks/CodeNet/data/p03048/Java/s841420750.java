import java.util.*;

class Main {
	public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int count = 0;
    String[] a = new String[n];
    for(int i = 0;i<a.length;i++) {
      a[i] = stdIn.next();
    }
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i<a.length;i++) {
      sb.append(a[i].toString());
    }
    for(int i = 0;i<sb.length()-1;i++) {
      String s1 = sb.substring(i,i+2);
      if(s1.equals("AB")) count+=1;
    }
    System.out.println(count);
	}
}