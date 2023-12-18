import java.util.Scanner;
     
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
          String p=sc.next();
          for(int i=0;i<p.length()-1;i++)
          {
            if(p.charAt(i)!=p.charAt(i+1))
              System.out.println("Yes");
            return;
          }
                 System.out.println("No");
        }
    }