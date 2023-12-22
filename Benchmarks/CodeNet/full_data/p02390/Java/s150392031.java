import java.util.Scanner;
class main {
public static void main(String[] a) {
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt(); ;
       int S = (i%3600)%60;
       int M = (i%3600)/60;
       int H = i/3600;
       
       System.out.println(H+":"+M+":"+S);
    }
    
}