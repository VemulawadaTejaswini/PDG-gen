import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int count = 0;
        int a = Integer.parseInt(scan.next());
        int comp = 0;
        int divide1 = 0;
        int divide2 = 0;
        int divide2_2 = 0;
        int top = 0;
        for(int i = 0;i<a;i++){
            list.add(Integer.parseInt(scan.next()));
        }
        if(list.size()>2) {
            Collections.sort(list);
            for (int i = 1; i < 2; i++) {
                int calc1 = list.get(i - 1);
                int calc2 = list.get(i);
                while ((count = calc2 % calc1) != 0) {
                    calc2 = calc1;
                    calc1 = count;
                    divide1 = calc1;

                }

            }
            int calc1 = list.get(1);
            int calc2 = list.get(2);
            while ((comp = calc2 % calc1) != 0) {
                calc2 = calc1;
                calc1 = comp;
                divide2 = calc1;
            }
            int calc3 = list.get(0);
            int calc4 = list.get(2);
            while ((comp = calc4 % calc3) != 0) {
                calc4 = calc3;
                calc3 = comp;
                divide2_2 = calc3;
            }
            if(list.get(list.size()-1)%divide2 == 0){
                top = divide2_2;
            }else if(list.get(list.size()-1)%divide2 == 0){
                top = divide2;
            }else{
                top = divide1;
            }
        }else{
            if(list.get(0)>list.get(1)){
                top = list.get(0);
            }else{
                top = list.get(1);
            }
        }
        count = 0;
        for (int i = 0; i < a; i++) {
            if(list.get(i) % top != 0){

                count += 1;
            }
            if(count >= 2){
                top = 1;
            }
            }
        PrintWriter out = new PrintWriter(System.out);
        out.println(top);
        out.flush();
        scan.close();
    }
}