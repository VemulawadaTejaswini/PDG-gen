import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Object[] Compiler = null;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        Integer[] hn = new Integer[n];
        long time = 0;
        if(n<k){
            System.out.println(0);
            return;
        }
        for(int i=0;i<n;i++){
            hn[i] = Integer.parseInt(sc.next());
        }
        //asList(s);は固定長のlistを返す
        //List<Integer> list = Arrays.asList(hn);
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(hn));
        Collections.sort(list,Collections.reverseOrder());
        for(int j=0;j<k;j++){
            list.remove(0);
        }
        for(int m : list){
            time = time + m;
        }
        System.out.println(time);

        }

    }
