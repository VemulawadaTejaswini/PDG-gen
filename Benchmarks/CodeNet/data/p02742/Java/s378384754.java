import  java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long h = Long.parseLong(sc.next());
        long w = Long.parseLong(sc.next());

        long h_count = 0;
        long w_count = 0;

        if(h == 1 && w == 1) System.out.println("0");
        
        if(h % 2 == 0) {
            h_count = h / 2;
            System.out.println(h_count * w);
        }
        else if(w % 2 == 0){
            h_count = h / 2 + 1;
            w_count = h_count - 1;
            System.out.println((h_count + w_count) * (w / 2));
        }else {
            h_count = h / 2 + 1;
            w_count = h_count - 1;

            //System.out.println(h_count);
            //System.out.println(w_count);
            System.out.println((h_count + w_count) * (w / 2) + h_count);
        }
    }
}
