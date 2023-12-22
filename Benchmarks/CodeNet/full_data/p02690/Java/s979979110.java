import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long x=scan.nextLong();
        HashMap<Long,Long> results=new HashMap<>();
        for (long i = -120; i <=120 ; i++) {
            results.put(i*i*i*i*i,i);
        }

        for(Long num:results.keySet()){
            if (results.containsKey(x+num)){
                System.out.println(results.get(x+num)+" "+results.get(num));
                break;
            }
        }


    }
}