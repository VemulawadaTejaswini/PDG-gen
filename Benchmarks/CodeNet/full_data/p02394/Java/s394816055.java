import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] num = str.split(" ",0);
        int w,h,x,y,r;

        w = Integer.valueOf(num[0]);
        h = Integer.valueOf(num[1]);
        x = Integer.valueOf(num[2]);
        y = Integer.valueOf(num[3]);
        r = Integer.valueOf(num[4]);
       if(x >= r && (x+r) <= w){
           if(y >= r && (y+r) <= h){
               System.out.println("Yes");
           }else{
               System.out.println("No");
           }
       }else{
           System.out.println("No");
       }


        scan.close();
    }
    
}

