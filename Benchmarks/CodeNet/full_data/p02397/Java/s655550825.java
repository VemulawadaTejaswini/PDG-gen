import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        boolean check = false;
        while(!check){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(x != 0 || y != 0){
                if(x > y){
                    int box = y;
                    y = x;
                    x = box;
                }
                System.out.println(x + " " + y);
            }else if (x == 0 && y == 0){
                check = true;
            }
        }
    }
}
