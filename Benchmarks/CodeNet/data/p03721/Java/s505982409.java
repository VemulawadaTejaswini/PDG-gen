import java.util.*;
public class Main {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N,K;
    N= sc.nextInt();
    K = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int a=0;a<N;a++){
        int ai = sc.nextInt();
        int bi =sc.nextInt();
        for(int b=0;b<bi;b++){
            list.add(ai);
        }
    }
    int kth_num=0;
    Collections.sort(list);
    System.out.println(list.get(K-1));
}
}
