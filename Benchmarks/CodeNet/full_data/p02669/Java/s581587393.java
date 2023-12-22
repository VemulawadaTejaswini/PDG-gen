
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int times=scan.nextInt();
        for (int i = 0; i <times ; i++) {

            long target = scan.nextLong();
            long multi2 = scan.nextLong();
            long multi3 = scan.nextLong();
            long multi5 = scan.nextLong();
            long step1 = scan.nextLong();

            MyMap map = new MyMap();
            NextNums nextNums = new NextNums();
            nextNums.put(target, 0);
            map.put(target, 0L);


            while (!nextNums.isEmpty()) {
                NextNums tempNums = new NextNums();
                for (Long num : nextNums.map.keySet()) {
                    long cost = nextNums.map.get(num);
                    map.put(0,  cost+num*step1);
                    for (int off = -5; off <= 5; off++) {
                        long tempCost = Math.abs(off) * step1;
                        if (num + off < 6) {
                            map.put(num + off, tempCost + cost);
                        }
                        if (num + off > 0) {
                            if ((num + off) % 2 == 0) {
                                long newCost = cost + tempCost + multi2;
                                long newNum = (num + off) / 2;
                                if (newNum > 0) {
                                    if (map.put(newNum, newCost)) {
                                        tempNums.put(newNum, newCost);
                                    }
                                }
                            }
                            if ((num + off) % 3 == 0) {
                                long newCost = cost + tempCost + multi3;
                                long newNum = (num + off) / 3;
                                if (newNum > 0) {
                                    if (map.put(newNum, newCost)) {
                                        tempNums.put(newNum, newCost);
                                    }
                                }
                            }
                            if ((num + off) % 5 == 0) {
                                long newCost = cost + tempCost + multi5;
                                long newNum = (num + off) / 5;
                                if (newNum > 0) {
                                    if (map.put(newNum, newCost)) {
                                        tempNums.put(newNum, newCost);
                                    }
                                }
                            }
                        }
                    }
                }
                nextNums = tempNums;
            }
            System.out.println(map.out());
        }
    }
}

class MyMap{
    HashMap<Long,Long> map=new HashMap<>();
    public boolean put(long num,long cost){
        boolean ret=false;
        if(num>=0) {
            if (!map.containsKey(num)) {
                map.put(num, cost);
                ret = true;
            } else {
                if (map.get(num) > cost) {
                    map.put(num, cost);
                    ret = true;
                }
            }
        }
        return ret;
    }
    public long out(){
        if (map.containsKey(0L)){
            return map.get(0L);
        }else {
            return 0;
        }
    }
}

class NextNums{
    HashMap<Long,Long> map=new HashMap<>();
    void put(long num,long cost){
        if (!map.containsKey(num)){
            map.put(num,cost);
        }else{
            if(map.get(num)>cost){
                map.put(num,cost);
            }
        }
    }
    boolean isEmpty(){
        return map.isEmpty();
    }
}