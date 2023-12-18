import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EnergyDrinkCollector {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] stNM = sc.nextLine().split(" ");
        int N = Integer.parseInt(stNM[0]);
        int M = Integer.parseInt(stNM[1]);

        class DoubleInteger implements Comparable<DoubleInteger>{

            int a;
            int b;

            public int compareTo(DoubleInteger ab) {return ab.a<this.a ? 1 : ab.a==0 ? 0 : -1;}

            public DoubleInteger(String a, String b) {
                this.a=Integer.parseInt(a);
                this.b=Integer.parseInt(b);
            }

        }

        List<DoubleInteger> AB = new LinkedList<>();

        for(int i=0;i<N;i++) {

            String stABi = sc.nextLine();

            if(stABi.isEmpty()) {
                break;
            }else{
            String[] sta = stABi.split(" ");
            AB.add(new DoubleInteger(sta[0],sta[1]));
            }

        }

        Collections.sort(AB);

        int result = 0;
        int i = 0;
        for(;M>0;i++) {
            result += AB.get(i).a * AB.get(i).b;
            M -= AB.get(i).b;
        }
        i--;

        result -= Math.abs(M) * AB.get(i).a;
        System.out.println(result);

    }

}