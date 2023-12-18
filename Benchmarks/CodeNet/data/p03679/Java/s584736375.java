import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
       
        int tabe = b-a;
      
      if(a>b){
        System.out.print("delicious");
      }if(tabe>x){
        System.out.print("dangerous");
      }if(a<b&&tabe<=x){
         System.out.print("safe");
      }
      
 
    }
}