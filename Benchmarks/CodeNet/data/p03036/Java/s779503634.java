import java.util.*;

class Main {
    static int r;
    static int D;
    static int x;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        r = sc.nextInt();
        D = sc.nextInt();
        x = sc.nextInt();

        int i=0;
        gram(x,i);
    }

    public static void gram(int xi, int i){
        int xip = r*xi - D;
        System.out.println(xip);
        if(i+1>=10){
            return;
        } else {
            gram(xip, i+1);
        }
    }
}