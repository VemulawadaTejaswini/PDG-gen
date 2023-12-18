import java.util.Scanner;

public class Main {
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int r = sc.nextInt()*100;
     int b = sc.nextInt()*10;
     int g = sc.nextInt()*1;

     int rbg = r+b+g;
     String ans = null;

     if(rbg%4!=0){
         ans = "NO";
     }else{
         ans ="YES";
     }
     System.out.println(ans);
 }
}

