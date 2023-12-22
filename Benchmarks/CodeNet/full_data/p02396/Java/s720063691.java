import java.util.Scanner;
  
class Main{
          public static void main(String [] args){
                      Scanner scan = new Scanner(System.in);
                      int i = 1;
                      while(scan.hasNext()){
                          int x = Integer.parseInt(scan.next());
                          System.out.println("Case " + i + ": " + x);
                          
                          if(x == 0){break;
                          }
　　　　　　　　　　　i++;
                      }
          }
}