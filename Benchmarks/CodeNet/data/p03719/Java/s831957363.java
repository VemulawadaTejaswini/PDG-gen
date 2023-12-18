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
    int kth_num =0;
    int num_k = 0;
    Collections.sort(list2);
    for(int a=0;a<N;){
        kth_num = list2.get(a);
        num_k = num_k+list.get(kth_num);
        if(num_k >=K) break;
        a++;
    }
    System.out.println(kth_num);
}
}