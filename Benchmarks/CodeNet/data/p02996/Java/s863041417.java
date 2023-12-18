//package Atcoder131;

import sun.tools.jstat.Scale;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        List<MapElement> list = new ArrayList<>();
        while(N>0){
            list.add(new MapElement(s.nextInt(),s.nextInt()));
            N--;
        }
        list.sort(new Comparator<MapElement>() {
            @Override
            public int compare(MapElement o1, MapElement o2) {
                return o1.v < o2.v ? -1 : 1;
            }
        });
//        Consumer<MapElement> myConsumer = (m)-> System.out.println(m.k+" "+m.v);
//        list.forEach(myConsumer);
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i).k;
            if(sum <= list.get(i).v){
                continue;
            }else{
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}

class MapElement implements Comparable<MapElement>{
    public int k;
    public int v;
    MapElement(int k , int v){
        this.k= k;
        this.v= v;
    }

    public int compareTo(MapElement me) {
        return this.v < me.v ? -1 : 1;
    }
}
