import java.util.*;
import java.util.Arrays;

public class Main{
        public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                String src = scan.next();
                String Array[] = src.split("");
                List<String> list = Arrays.asList(Array);

                int count0 = Collections.frequency(list, "0");
                int count1 = Collections.frequency(list, "1");

                if(count0 > count1){
                        System.out.println(count1*2);
                }else{
                        System.out.println(count0*2);
                }
        }
}