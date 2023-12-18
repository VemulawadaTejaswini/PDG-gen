//encoded utf-8
//tested with jdk 11

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //br.readLine(); return String one line.
        //Integer.parseInt(); String to Integer(Primitive).
        //String[] hoge = str.split(" ", 0);
        String[] NK = br.readLine().split(" ", 0);
        String[] aStr = br.readLine().split(" ", 0);
        LinkedList<Integer> an = new LinkedList<>();
        LinkedList<Integer> arrAn = new LinkedList<>();
        for(int i = 0; i < Integer.parseInt(NK[0]); i++){
            an.add(Integer.parseInt(aStr[i]));
        }
        an = Quick.sort(an);
        int counter = 0;
        arrAn.add(1);
        for(int i = 1; i < Integer.parseInt(NK[0]); i ++){
            if(an.get(i) != an.get(i - 1)){
                counter ++;
                arrAn.add(0);
            }
            arrAn.set(counter, arrAn.get(counter) + 1);
            System.out.println(arrAn);
        }
        if(arrAn.size() <= Integer.parseInt(NK[1])){
            System.out.println(0);
            return;
        }
        System.out.println(arrAn);
        arrAn = Quick.sort(arrAn);
        System.out.println(arrAn);
        counter = 0;
        for(int i = 0; i < arrAn.size() - Integer.parseInt(NK[1]); i ++){
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
