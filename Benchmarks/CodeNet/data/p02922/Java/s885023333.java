import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in); 

        int A = sc.nextInt(); 
        int B = sc.nextInt(); 

        int Z= 0;  //最小さい電源タッブ数

      for (Z = 0;  Z <=  ((B -A +1)/A -1); Z++)  {
            if  (Z > (B -A +1)/A) {
              break;
          }      
}
      System.out.println("最小さい電源タッブは、" + Z);
   }
} 