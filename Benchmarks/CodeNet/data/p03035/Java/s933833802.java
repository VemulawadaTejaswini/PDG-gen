import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int A = sc.nextInt();
     int B = sc.nextInt();
     int ans;
     if(A>=13){
      ans = B;
    }else if(A>=6){
      ans = B/2;
    }else{
      ans = 0;
    }

     System.out.println(ans);

   }
}
