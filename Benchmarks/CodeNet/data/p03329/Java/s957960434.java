import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nine = new ArrayList<>();
        List<Integer> six = new ArrayList<>();
        nine.add(0);
        nine.add(9);
        for(int i = 2;i <= 7;i++){
            nine.add(nine.get(i-1)*9);
        }
        six.add(6);
        for(int i = 1;i <= 6;i++){
            six.add(six.get(i-1)*6);
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(nine);
        list.addAll(six);
        Collections.sort(list);
        //System.out.println(list);
        int count = 0;
        while(n > 6){
            int index = sub(n,list);
         //   System.out.println("index " + index);
            if(index > 0){
                count++;
            }
            n -= list.get(index);
        }
        System.out.println(count+n);
    }
    public static int sub(int n,List<Integer> x){
        int i = x.size();
        if(n <= 0){
            return 0;
        }
        while(n-x.get(i-1) < 0){
            i--;
        }
        return i-1;
    }
}
