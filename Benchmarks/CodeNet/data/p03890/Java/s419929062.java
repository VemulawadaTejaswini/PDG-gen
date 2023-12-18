import java.io.*;
import  java.util.*;

import static java.lang.System.in;

class Main{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList<Integer> cur = new LinkedList<>(),next = new LinkedList<>();
        for(int i=0;i<(1<<N);i++) cur.add(sc.nextInt());
        while(cur.size()>1){
            int p = cur.poll(), q = cur.poll();
            if(p==q) next.add(p);
            else next.add(Math.abs(p-q));
            if(cur.size()==0){
                cur=next;
                next = new LinkedList<>();
            }
        }
        int ans = cur.poll();
        System.out.println(ans);
    }
}
