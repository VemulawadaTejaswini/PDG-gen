import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }
 
    public void input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> numList = new ArrayList<Long>();
        for(int i = 0; i < n; i++){
            numList.add(sc.nextLong());
        }
        Collections.sort(numList);
        sc.close();
        long num = numList.get(n - 1) / 2;
        long min = binsearch(numList,numList.size(),num);
        long max = numList.get(n - 1);
        System.out.println(max + " " + min);
    }

    static long binsearch(ArrayList<Long> list, int n, long key){
        if(list.size () == 2){
             return list.get(0);
        }
        int pl = 0;
        int pr = n - 1;
        while(pl <= pr){
            int pc = (pl + pr) / 2;
            if(key == list.get(pc) || key == list.get(pc + 1)){
                return key;
            }else if(key > list.get(pc) && key < list.get(pc + 1)){
                if((key * 2 + 1) - list.get(pc) * 2 <= Math.abs((key * 2 + 1) - list.get(pc + 1) * 2) || list.get(pc + 1) == list.get(n - 1)){
                    return list.get(pc);
                }else{
                    return list.get(pc + 1);
                }
            }else if(key < (list.get(pc))){
                pr = pc - 1;
            }else{
                pl = pc  + 1;
            }
        }
        return list.get(pl);
    }
}