import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        long a = Long.parseLong(line1[0]);
        long b = Long.parseLong(line1[1]);
        List<Long> ary = new ArrayList<>();
        for(long i = 1; i <= Math.min(a, b); i++){
            if(a % i == 0 && b % i == 0)    ary.add(i);
        }
        int count = 0;
        long max = ary.get(ary.size() - 1);
        //if(ary.get(1) == 2) count++;
        for(int i = 1; i < ary.size(); i++){
            int flag = 0;
            for(long j = 2; j < ary.get(i); j++){
                //System.out.println(ary.get(i));
                //System.out.println(ary.get(i) % j + "aa");
                if(ary.get(i) % j == 0){
                    flag = 1;
                    break;
                }
                //System.out.println(i + " " + j);
            }
            if(flag == 0)   count++;
            //System.out.println(count + "count");
        }
        System.out.println(count + 1);
    }
}