import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\s");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int x =a;
        int y =b;
        int z =c;
        if(x<y){
        x = b;
        y = a;
        }
        if (y<z){
            y = c;
            z = b;
        }
        if (x<y){
            x = c;
            y = b;
        }
        System.out.println(z+" "+y+" "+x);
    }
}
