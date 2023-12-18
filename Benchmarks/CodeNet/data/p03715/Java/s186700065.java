import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        if(h % 3 == 0 || w % 3 == 0){
            System.out.println(0);
            return;
        }
        long res = Math.min(h, w);
        if(w % 2 == 1){
            long diff = (3*w - 1) * (h/3 + 1) / 2 - h*(w-1)/2;
            res = Math.min(res, diff);
            diff = h*(w + 1) / 2 - (3*w + 1) * (h/ 3) / 2;
            res = Math.min(res, diff);
        }else{
            long diff = 3*w*(h / 3 + 1) / 2 - h*w/2;
            res = Math.min(res, diff);
            diff = w*h / 2 - 3*w*(h/3) / 2;
            res = Math.min(res, diff);
        }
        if(h % 2 == 1){
            long diff = (3*h - 1) * (w/3 + 1) / 2 - w*(h-1)/2;
            res = Math.min(res, diff);
            diff = w*(h+1) / 2 - (3*h + 1) * (w/3) / 2;
            res = Math.min(res, diff);
        }else{
            long diff = 3*h*(w/3 + 1) / 2 - w*h/2;
            res = Math.min(res, diff);
            diff = w*h / 2 - 3*h*(w/3) / 2;
            res = Math.min(res, diff);
        }
        System.out.println(res);
    }
}
