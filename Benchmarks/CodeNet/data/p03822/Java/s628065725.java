//package com.grand9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static HashMap<Integer,LinkedList<Integer>> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //int match[] = new int [N];
        for(int i=2;i<=N;i++){
           int tmp = sc.nextInt();
            if(!map.containsKey(tmp)){
                LinkedList<Integer> list = new LinkedList<>();
                list.add(i);
                map.put(tmp,list);
            }
            else{
                map.get(tmp).add(i);
            }
        }

        //int ans = findDepth(1,match);
        int ans = findDepth(1);

        System.out.println(ans);


        sc.close();

    }

//    private static int findDepth(int tar , int match[]){
//        int ret = 0;
//        int cnt = 0;
//        for(int i=0;i<match.length;i++){
//            if(match[i]==tar){
//                cnt++;
//                ret = Math.max(ret, findDepth(i+1,match)+1);
//            }
//        }
//        ret = Math.max(ret,cnt);
//        return ret;
//    }

    private static int findDepth(int tar){
        if(!map.containsKey(tar)) return 0;
        else{
            int ret = 0;
            int sum = 0;
            for(int i:map.get(tar)){
                int t = findDepth(i);
                ret = Math.max(ret,t+1);
                sum += Math.pow(2,t+1);
            }
           // System.out.println(tar+","+sum+","+(int)(Math.log(sum)/Math.log(2.0)));
            ret = Math.max(ret,(int)(Math.log(sum)/Math.log(2.0)));
            return ret;
        }
    }

 }
