import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
       
        if(a.equals("H")){
          System.out.print(b);
        }if(a.equals("D")){
          if(b.equals("H")){System.out.print("D");}
          if(b.equals("D")){System.out.print("H");}
        }
      
    }
}