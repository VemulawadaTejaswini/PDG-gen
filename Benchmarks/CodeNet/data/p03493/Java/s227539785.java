import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      
      if(a==000){
        System.out.print(0);
       }else if(a==001|a==010|a==100){
        System.out.print(1);
       }else if(a==011|a==101|a==110){
        System.out.print(2);
      }else if(a==111){
        System.out.print(3);
      }
 
      
    }
}