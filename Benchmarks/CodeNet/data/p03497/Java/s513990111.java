//encoded utf-8
//tested with jdk 11

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Reader rd = new Reader(System.in);
        //br.readLine(); return String one line.
        //Integer.parseInt(); String to Integer(Primitive).
        //String[] hoge = str.split(" ", 0);
        int N = rd.nextInt();
        int K = rd.nextInt();
        LinkedList<Integer> an = new LinkedList<>();
        LinkedList<Integer> arrAn = new LinkedList<>();
        for(int i = 0; i < N; i++){
            an.add(rd.nextInt());
        }
        an = Quick.sort(an);
        int counter = 0;
        arrAn.add(1);
        for(int i = 1; i < N; i ++){
            if(an.get(i) != an.get(i - 1)){
                counter ++;
                arrAn.add(0);
            }
            arrAn.set(counter, arrAn.get(counter) + 1);
        }
        if(arrAn.size() <= K){
            System.out.println(0);
            return;
        }
        arrAn = Quick.sort(arrAn);
        counter = 0;
        for(int i = 0; i < arrAn.size() - K; i ++){
            counter += arrAn.get(i);
        }
        System.out.println(counter);
    }
}

class Reader{
    private BufferedReader br;
    private StringTokenizer st;

    public Reader(InputStream in){
        br = new BufferedReader(new InputStreamReader(in));
        st = null;
    }
    public String nextString() throws IOException{
        while( st==null || !st.hasMoreTokens() )
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    public int nextInt() throws IOException{
        return Integer.parseInt(nextString());
    }
    public long nextLong() throws IOException{
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException{
        return Double.parseDouble(nextString());
    }
}

class Quick{
    public static LinkedList<Integer> sort(LinkedList<Integer> linkedList) {
        //conquer finish
        if (linkedList.size() <= 1) {
            return linkedList;
        }
        //pivot select
        Random rmg = new Random();
        int pivId = rmg.nextInt(linkedList.size());
        //divide
        LinkedList<Integer> leftPart = new LinkedList<Integer>();
        LinkedList<Integer> rightPart = new LinkedList<Integer>();
        int temp = linkedList.get(pivId);
        //left and right added
        for (int i = 0; i < linkedList.size(); i++) {
            if (i == pivId) {
                leftPart.add(linkedList.get(i));
                continue;
            }
            if (linkedList.get(i) < temp) {
                leftPart.add(linkedList.get(i));
            } else {
                rightPart.add(linkedList.get(i));
            }
        }
        //conquer
        leftPart = sort(leftPart);
        rightPart = sort(rightPart);
        //combine to one linkedlist
        for (int i = 0; i < leftPart.size(); i++) {
            linkedList.set(i, leftPart.get(i));
        }
        for (int i = leftPart.size(); i < linkedList.size(); i++) {
            linkedList.set(i, rightPart.get(i - leftPart.size()));
        }
        return linkedList;
    }
}
