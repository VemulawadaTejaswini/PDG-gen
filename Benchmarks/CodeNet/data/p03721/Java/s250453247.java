import java.util.*;
public class Main {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N,K;
    N = sc.nextInt();
    K = sc.nextInt();
    Map<Integer,Integer> list = new HashMap<Integer,Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    for(int a=0;a<N;a++){
        int ai = sc.nextInt();
        int bi = sc.nextInt();
        list.put(ai,bi);
        list2.add(ai);
    }
    int min_num=0;
    for(int a=0;a<K;){
        min_num =Collections.min(list2);
        a=a+list.get(min_num);
        list2.remove(list2.indexOf(min_num));
    }
    System.out.println(min_num);
}
}