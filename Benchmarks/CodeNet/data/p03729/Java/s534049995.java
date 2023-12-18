import java.util.Scanner;
class bo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String a= sc.next();
       String b=sc.next();
       String c=sc.next();
       int l1= a.length();
       int l2= b.length();
       if(a.charAt(l1-1)==b.charAt(0)&& b.charAt(l2-1)==c.charAt(0)) {
       System.out.println("YES");
       } else {
       System.out.println("NO");
       }
 }
 }
          