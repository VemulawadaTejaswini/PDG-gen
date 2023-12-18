import java.util.*;
import java.io.*;
class Counter<T> extends HashMap<T,Integer>{
    public Counter(){
        super();
    }
    public Integer get(Object elm){
        return getOrDefault(elm,0);
    }
    public void add(T elm, int amount){
        if(!this.containsKey(elm)) put(elm, amount);
        else replace(elm, get(elm)+amount);
    }
    public void addOne(T elm){
        add(elm, 1);
    }
    public void remove(T elm, int amount){
        replace(elm, Math.max(get(elm)-amount, 0));
    }
    public void removeOne(T elm){
        remove(elm, 1);
    }
}
public class Main {
    static Counter<Character> countChar(String s){
        Counter<Character> c = new Counter();
        for(int i=0; i<s.length(); i++) c.addOne(s.charAt(i));
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 0;
        Counter<Counter<Character>> counter = new Counter<>();
        for(int n=0; n<N; n++){
            Counter<Character> c = countChar(sc.next());
            ans += counter.get(c);
            counter.addOne(c);
        }
        System.out.println(ans);
    }
}