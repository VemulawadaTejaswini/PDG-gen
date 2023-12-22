import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Deque<Integer> d = new Deque<Integer>();
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++){
            int qu = sc.nextInt();
            switch(qu){
                case 0: int d = sc.nextInt(); if(d == 0) qu.addFirst(sc.nextInt()); else qu.addLast(sc.nextInt()); break;
                case 1: int p = sc.nextInt(); for(int i = 0 ; i < qu.size() ; i++){ if(i == p) System.out.println(qu.element()); qu.addLast(qu.element()); qu.removeFirst();} break;
                case 2: int d = sc.nextInt(); if(d == 0) qu.removeFirst(); else qu.removeLast(); break;
            }
        }
    }
}
