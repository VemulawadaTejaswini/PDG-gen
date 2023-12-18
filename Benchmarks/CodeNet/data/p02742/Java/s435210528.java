import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long h = scan.nextLong();
        long w = scan.nextLong();
        scan.close();
        long men = h * w;

        if(men % 2 == 0) System.out.println(men / 2);
        else System.out.println((men / 2) + 1);
    }
}