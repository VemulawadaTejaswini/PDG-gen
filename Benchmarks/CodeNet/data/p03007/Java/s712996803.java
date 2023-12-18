import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        List<Long> list = new ArrayList<>();
        boolean flagplus = false;
        boolean flagminus = false;

        long min = INF;
        for(int tmp=0;tmp<m;tmp++){
            long a = sc.nextLong();
            if(Math.abs(a) < min) min = a;

            if(a < 0) flagminus = true;
            if(a > 0) flagplus = true;
            list.add(a);
        }

        long result = 0;
        if(flagminus && flagplus){
            for(int tmp = 0; tmp < list.size(); tmp++){
                result += Math.abs(list.get(tmp));
            }
            System.out.println(result);

            long minus = Collections.min(list);
            list.remove(minus);

            List<Long> listPlus = list.stream().filter(s -> s >= 0).collect(Collectors.toList());
            List<Long> listMinus = list.stream().filter(s -> s<0).collect(Collectors.toList());
            System.out.println(minus + " " + listPlus.get(0));

            long number = minus - listPlus.get(0);
            listPlus.remove(0);
            for(long i: listPlus){
                System.out.println( i+" "+number);
                number = i - number;
            }
            for(long i: listMinus){
                System.out.println(number + " " + i);
                number = number - i;
            }



        }else{

            list.remove(min);
            for(int tmp = 0; tmp < list.size(); tmp++){
                result += Math.abs(list.get(tmp));
            }
            result -= Math.abs(min);
            System.out.println(result);
            long number;
            System.out.println(min + " " + list.get(0));
            number = min - list.get(0);
            for(int tmp = 1; tmp < list.size() - 1; tmp++){
                System.out.println(number + " " + list.get(tmp));
                number -= list.get(tmp);
            }
            if(flagplus){
                System.out.println(list.get(m - 2) + " " + number);
            } else {
                System.out.println(number + " " + list.get(m -2));
            }
        }


    }
}