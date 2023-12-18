import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();


        int i = 0;
        int j = 3;

        char[] c = str.toCharArray();
        int count = 0;
        while(j < c.length) {
            StringBuilder sb1 = new StringBuilder();
            for (int k = i; k <= j; k++) {
                 sb1 = sb1.append(c[k]);
            }
            int sb = Integer.parseInt(sb1.toString());
            if(sb<2019){
                j++;
                continue;
            }
            if(sb % 2019 == 0){
                count = count+1;
                // System.out.println("i:"+(i+1)+",j:"+(j+1));
                i = j;
                j = j+3;
            } else {
                i++;
                j++;
            }
            
        }

        System.out.println(count);
    }
}