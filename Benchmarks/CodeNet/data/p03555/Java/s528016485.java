import java.util.Scanner;
class Main{
           public static void main(String args[]){
                 Scanner sc = new Scanner(System.in);
                 String a = sc.next();
                 String b = sc.next();
                 if ((a.charAt(0) == b.charAt(2)) && (a.charAt(1)==b.charAt(1)) && (a.charAt(2)==b.charAt(0))) {
                   System.out.println("Yes");
                  }
                 else{
                   System.out.println("No");
                  }
           }
}
