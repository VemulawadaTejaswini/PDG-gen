//package com.beginner.b053;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<N;i++){
            int key = sc.nextInt();
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }

        int A=0;
        int B=0;
//        Iterator iter = map.keySet().iterator();
//        while (iter.hasNext()) {
//            Object key = iter.next();
//            Integer val = (Integer)map.get(key);
//            if(val%2==0){
//                B++;
//            }
//            else{
//                A++;
//            }
//        }
        for(Integer i : map.keySet()){
            if(map.get(i)%2==0){
                B++;
            }
            else{
                A++;
            }
        }

        int ans = 0;
        if(B%2==0){
            ans = A+B;
        }
        else{
            ans = A+B-1;
        }


        System.out.println(ans);

        sc.close();
    }

}