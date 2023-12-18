import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (a+b<=2*c){
            System.out.println(a*x+b*y);
        }else{
            int i = Math.abs(x-y);
            int j;
            if (x>y){
                if (a>2*c){
                    j = 2*c*i;
                }else{
                    j = a*i;
                }
            }else if (x<y){
                if (b>2*c){
                    j = 2*c*i;
                }else{
                    j = b*i;
                }
            }else {
                j = 0;
            }
            System.out.println(Math.min(x,y)*2*c+j);

        }
    }

}