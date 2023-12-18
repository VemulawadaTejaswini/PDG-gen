import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long s = Long.parseLong(sc.next());
        
        int x1 = 1000000000;
        int x2 = 1;
        int y1, y2;
        if(s%x1 == 0){
            y1 = 0;
            y2 = (int)(s/x1);
        }else{
            y1 = x1 - (int)(s%x1);
            y2 = (int)(s/x1) +1;
        }
        
        System.out.println(x1 +" " +y1 +" " +x2 +" " +y2 +" 0 0");
    }
}