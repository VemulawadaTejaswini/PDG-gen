import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[]ss = S.toCharArray();
    String A = sc.next();
    char[]a = A.toCharArray();
 
    if(ss[0] == a[0]){
        System.out.println("H");    
     }else{
        System.out.println("D");
}
}
}
