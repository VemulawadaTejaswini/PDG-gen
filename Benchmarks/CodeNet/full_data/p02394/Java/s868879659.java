import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        int x, y, r, w, h, maxx, maxy, minx, miny;
        Scanner scan = new Scanner(System.in);
        w = scan.nextInt();
        h = scan.nextInt();
        x = scan.nextInt();
       	y = scan.nextInt();
        r = scan.nextInt();
        maxx = x + r;
        maxy = y + r;
        minx = x - r;
        miny = y - r;
        if(w >= maxx && h >= maxy && 0 <= minx && 0 <= miny){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
        scan.close();
    }
}
