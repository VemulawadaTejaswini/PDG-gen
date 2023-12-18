
import java.util.*;

class Order{
    int a,b,c;
}

class Main {
   /* public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        String ss=s.next();
        int q=s.nextInt();

        List<Order> querys=new ArrayList<>();

        for (int i = 0; i <q ; i++) {
            Order o=new Order();
            o.a=s.nextInt();
            o.b=s.nextInt();
            o.c=s.nextInt();
            querys.add(o);
        }



    }*/
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        int m=s.nextInt();

        int[] ret=new int[3];
        for (int i = 0; i <n ; i++) {
            ret[i]=0;
        }
        HashMap<Integer,Integer> setted=new HashMap<>();
        for (int i = 0; i <m ; i++) {
            int ss=s.nextInt();
            int cc=s.nextInt();
            if(setted.get(ss)!=null&&cc!=setted.get(ss)){
                System.out.println("-1");
                return;
            }
            if(ss>n){
                System.out.println("-1");
                return;
            }
            setted.put(ss,cc);
            ret[ss-1]=cc;
        }
        String hage="";
        for (int i = 0; i <n ; i++) {
           hage+=ret[i];
        }

        int va=Integer.parseInt(hage);
        if(String.valueOf(va).length()!=n){
            System.out.println("-1");
            return;
        }
        System.out.println(va);

    }
}
