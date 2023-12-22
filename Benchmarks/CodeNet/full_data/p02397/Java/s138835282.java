import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int x;
        int y;
  
  while(true){
    x = sc.nextInt();
    y = sc.nextInt();
    if ( x == 0 && y == 0 ) break;  

  
        if(x<y){
             System.out.println(x + " " + y);
        }else{
             System.out.println(y + " " + x);
        }
    }
    }
}

