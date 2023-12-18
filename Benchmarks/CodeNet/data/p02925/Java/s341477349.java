import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner("3\n2 3\n1 3\n1 2");
        int n = Integer.parseInt(sc.next());
        ArrayList<Queue<Integer>> event = new ArrayList<Queue<Integer>>();
        for(int i=0;i<n;i++){
            Queue<Integer> tmp = new ArrayBlockingQueue<Integer>(n-1);
            for(int j=0;j<n-1;j++){
                tmp.add(Integer.parseInt(sc.next()));
            }
            event.add(tmp);
        }
        boolean[] yet = new boolean[n];
        
        int cnt = 0;
        boolean can = true;
        while(can){
            Arrays.fill(yet, true);
            can = false;
            for(int i=0;i<n;i++){
                if(yet[i]){
                    Integer rival = event.get(i).peek();
                    if (rival==null){continue;}
                    Integer erival = event.get(rival-1).peek();
                    if(erival==null){continue;}
                    if(yet[rival-1] && erival.equals(i+1)){
                        yet[i] = false;
                        yet[rival-1] = false;
                        event.get(i).poll();
                        event.get(rival-1).poll();
                        can = true;
                    }else{
                        continue;
                    }
                }else{
                    continue;
                }
            }
            if(can){
                cnt++;
                continue;
            }
            break;
        }
        if(cnt>0){
            System.out.println(cnt);
        }else{
            System.out.println(-1);
        }
    }
}