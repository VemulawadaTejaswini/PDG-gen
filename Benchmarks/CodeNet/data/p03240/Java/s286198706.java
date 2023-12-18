
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<D> arrayList = new ArrayList<>();
        for (int i = 0;i < n;++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int h = sc.nextInt();
            D d = new D();
            d.x = x;
            d.y = y;
            d.h = h;
            arrayList.add(d);
        }

        for (int cx = 0;cx <= 100;++cx){
            for (int cy = 0;cy <= 100;++cy){
                long last = -1;
                boolean flag = false;
                for (int i = 0;i < n;++i){
                    long a = Math.abs(arrayList.get(i).x - cx) + Math.abs(arrayList.get(i).y - cy) + arrayList.get(i).h;
                    if(last >= 0){
                        if(last != a){
                            flag = true;
                            break;
                        }
                    }
                    last = a;
                }
                if(!flag) System.out.println(cx + " " + cy + " " + last);
            }
        }


    }


    static class D{
        long x;
        long y;
        long h;
    }



}


