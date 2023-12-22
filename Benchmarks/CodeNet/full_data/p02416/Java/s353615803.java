import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      while(true){
          int sum=0;
            String s = sc.next();
            if( s.equals("0"))
                break;
            for(int i = 0; i < s.length(); i++){
              Character.getNumericValue(s.charAt(i));
            sum+=Character.getNumericValue(s.charAt(i));
            }
            System.out.println(sum);
        }
        sc.close();
    }
}

