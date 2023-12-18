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

        for(int i = 0;i<a;i++){
            list.add(Integer.parseInt(scan.next()));
        }
        for(int i = 0;i<a;i++){
            list2.add(Integer.parseInt(scan.next()));
        }
        for(int i = 0;i<a;i++){
            if(list.get(i) - list2.get(i) > 0){
              count += (list.get(i) - list2.get(i));
            }
        }
       PrintWriter out = new PrintWriter(System.out);
        out.println(count);
        out.flush();
        scan.close();
    }
}