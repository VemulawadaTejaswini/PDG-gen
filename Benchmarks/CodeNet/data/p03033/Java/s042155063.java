import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.Iterator;

class Event implements Comparable<Event>{
    int kind; int time; int x;
    public Event(int s, int t, int x){
        this.x = x;
        if(t==0){
            this.kind = 1;
            this.time = s-x;
        }else{
            this.kind = -1;
            this.time = t-x;
        }
    }
    @Override
    public int compareTo(Event e){
        return e.time - this.time;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        ArrayList<Event> e = new ArrayList<Event>();
        for(int i=0;i<n;i++){
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            e.add(new Event(s, 0, x));
            e.add(new Event(0, t, x));
        }
        Collections.sort(e);
        TreeSet<Integer> x = new TreeSet<Integer>();
        int people[] = new int[q];
        for(int i=0;i<q;i++){
            people[i] = Integer.parseInt(sc.next()); 
        }
        int time = e.get(n-1).time;
        int curp = 0;
        while(true){
            if(n==0){
                break;
            }
            Event a = e.get(n-1);
            if(time == a.time){
                if(a.kind == 1){
                    x.add(a.x);
                }else{
                    x.remove(a.x);
                }
                e.remove(0);
                n--;
                continue;
            }else{
                if(time == people[curp]){
                    Iterator<Integer> xi = x.iterator();
                    if(!xi.hasNext()){
                        System.out.println(-1);
                    }else{
                        System.out.println(xi.next());
                    }
                    curp++;
                }
                if(e.isEmpty()){
                    break;
                }
            }
            time++;
        }
        Iterator<Integer> xi = x.iterator();
        int remain = 0;
        if(!xi.hasNext()){
            remain = -1;
        }else{
            remain = xi.next();
        }
        while(curp<q){
            System.out.println(remain);
            curp++;
        }
        sc.close();
    }
}