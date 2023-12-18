import java.util.*;
	class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long k = sc.nextInt();
        double h = 100;
        long c = 0;
        boolean bool = true;
        while(bool){
            if(h>k){
                System.out.println(c);
                bool = false;
                return;
            }
            c = c + 1;
            h = h + (h*0.01);
            Math.floor(h);
        }
    }
}