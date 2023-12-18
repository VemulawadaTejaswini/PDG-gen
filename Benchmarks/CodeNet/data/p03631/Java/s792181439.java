import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nexLine();
      
      if(n.charAt(0)==n.charAt(2)){
        System.out.print("Yes");
      }else{
         System.out.print("No");
      }

    }
}