import java.util.Scanner;

public class main{
 public static void main(String[] args){
  Scanner ex = new Scanner(System.in);
  while(true){
   int mid = ex.nextInt();
   int fin = ex.nextInt();
   int re = ex.nextInt();
   if(mid == -1 && fin == -1 && re == -1) break;
   if(mid == -1 || fin == -1){
    System.out.println("F");
   }else if(mid + fin >= 80){
    System.out.println("A");
   }else if(mid + fin >= 65 && mid + fin < 80){
    System.out.println("B");
   }else if(mid + fin >= 50 && mid + fin < 65){
    System.out.println("C");
   }else if(mid + fin >= 30 && mid + fin < 50 ){
    if(re >= 50){
     System.out.println("C");
    }else{
     System.out.println("D");
    }
   }else{
    System.out.println("F");
   }
  }
 }
}