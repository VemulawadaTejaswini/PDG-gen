   import java.util.*;    
public class main{
      public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (Character.isUpperCase(a)){
    		System.out.println('A');
        }
        else{
          System.out.println('a');
        }
      }
    }