import java.util.Scanner;

public class Main{
   public void solve(){
      Scanner sc = new Scanner(System.in);
      int syu,mai;

      for(int i=0;i<4,i++){
         syu = sc.nextInt();
         mai = sc.nextInt();

         switch(syu){
            case 1:
            System.out.println(6000*mai);
            break;

            case 2:
            System.out.println(4000*mai);
            break;

            case 3:
            System.out.println(3000*mai);
            break;

            case 4:
            System.out.println(2000*mai);
            break;
         }
      }
   }

   public static void main(String[]args){
      Main obj = new Main();
      obj.solve();
   }
}