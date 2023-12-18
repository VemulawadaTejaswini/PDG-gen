import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int a = sc.nextInt();
      	int b = sc.nextInt();
        int min = 0;
      
      if(b>=a&&b<=a+W){System.out.print(0);}
      else if(b+W>=a&&b+W<=a+W){System.out.print(0);}
      else{
      	min = Math.abs(a-(b+W));
        min = Math.min(min,Math.abs(b-(a+W)));
        System.out.print(min);
      }

    }
      

}