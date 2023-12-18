

import java.util.*;

class Order{
    int a,b,c;
}

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        char[] ss=s.next().toCharArray();
        int q=s.nextInt();

        List<Order> querys=new ArrayList<>();

        for (int i = 0; i <q ; i++) {
            Order o=new Order();
            o.a=s.nextInt();
            o.b=s.nextInt();
            if(o.a==1){
                o.c=s.next().charAt(0);
            }else{
                o.c=s.nextInt();
            }
            querys.add(o);
        }
        for (int i = 0; i <q ; i++) {

            Order o=querys.get(i);
            if(o.a==1){
                ss[o.b-1]= (char) o.c;
                //System.out.println(ss);
            }else{
                int start=o.b;
                int end=o.c;
                Set<Integer> buf=new HashSet<>();
                for (int j = start; j <=end ; j++) {
                    buf.add((int) ss[j-1]);
                }
                System.out.println(buf.size());
            }

        }


    }
}
