

import java.util.*;
import java.util.stream.IntStream;

class Main {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        int k= s.nextInt();

        double buf=0;
        int count=0;
        double maxValue=0;
        List<Double> list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            int a= s.nextInt();
            double exp=IntStream.range(0,a+1).sum()/(double)(a);
            list.add(exp);
            buf+=exp;
            count++;
            if(count==k){
                if(maxValue<buf){
                    maxValue=buf;
                }
                count--;
                buf-= list.get(i - (k-1));
            }
        }
        System.out.println(maxValue);

    }

}