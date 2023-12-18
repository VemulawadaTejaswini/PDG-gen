import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main{

    static long L;

    static int grundy(long v){
        for(int i=0;i<19;++i)if(((v>>i)&1)==1)return (1<<i);
        return 0;
    }

    // どの高さの木を新しく踏んだか？
    // 一番最初に未踏の地を踏んだとこの木を消す
    // そこから一番最後一個手前までの木を追加する

    static class Node{
        Node next[] = new Node[2];
        int depth = 0;
        Node(int d){
            depth=d;
        }
        void add(int i){
            next[i]=new Node(depth + 1);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        L  = scan.nextLong();
        Node root = new Node(-1);
        Map<Long, Integer> trees = new HashMap<>();
        trees.put(L, 2);
        for(int i=0;i<N;++i){
            String s = scan.next();
            Node r = root;
            long first=-1;
            for(int j=0;j<s.length();++j){
                int n = s.charAt(j)-'0';
                if(r.next[n]==null){
                    r.add(n);
                    r=r.next[n];
                    if(first<0){
                        first=L-r.depth;
                        trees.put(L-r.depth, trees.get(L-r.depth)-1);
                    }
                    else{
                        if(!trees.containsKey(L-r.depth))trees.put(L-r.depth, 0);
                        trees.put(L-r.depth, trees.get(L-r.depth)+1); // getだけで出来る？
                    }
                }else{
                    r=r.next[n];
                }
            }
        }
        int grn = 0;
        for(Map.Entry<Long,Integer> entry : trees.entrySet()){
            if((int)entry.getValue()%2==1)grn^=grundy((long)entry.getKey());
        }
        System.out.println(grn==0 ? "Bob":"Alice");
        
    }
}