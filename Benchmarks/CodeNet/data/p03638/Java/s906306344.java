

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        new Main().q3();
    }
    
    public void q3(){
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int n =sc.nextInt();
        List<Integer> list = new ArrayList<Integer>(n+1);
        for(int i = 0; i < n; i++) {
          list.add(sc.nextInt());
        }
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        
        List<Integer> subset = new ArrayList<Integer>();
        
        for(int i = 0; i < list.size(); i++) {
            
            for(int j = 0; j < list.get(i); j++) {
              
                subset.add(i+1);
                if(subset.size() == w){
                    answer.add(subset);
                    subset = new ArrayList<Integer>();
                }
            }
        }
        for(int i = 0; i < h; i++) {
            subset = answer.get(i);
            if(i%2==1){
                Collections.reverse(subset);
            }
            for(Integer nn:subset){
                System.out.print(nn + " ");
            }
            System.out.println();
        }
        
        
    }
    
    public void q2(){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        //最後に打つ人が勝つかどうか調べる
        List<Integer> list = new ArrayList<Integer>();
        long debug=n;
        while (debug>0){
            //System.out.print(debug%4);
            list.add((int)debug%4);
            debug/=4;
        }
        Collections.reverse(list);
        
        //先に
        //先に01 00が出たらラストプレイヤーの負け
        //先に11が出ればラストプレイヤーの勝ち
        //先頭が01で10しかなければラストプレイヤーの勝ち
        //先頭が10で10しかなければ
        boolean lastwin;
        int first = list.get(0);
        list.remove(0);
        for(Integer i:list){
            if(i<2){
                if(first<2){
                    System.out.println("Takahashi");
                }else{
                    System.out.println("Aoki");
                }
                return;
            }
            if(i==3){
                if(first<2){
                    System.out.println("Aoki");
                }else{
                    System.out.println("Takahashi");
                }
                return;
            }
        }
        
        if(first<2){
            System.out.println("Aoki");
        }else{
            System.out.println("Takahashi");
        }
        return;
        
        
        
        
    }
    
    
    public void q1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int ni=0;
        int yon=0;
        int zero=0;
        
        
        for(int i = 0; i < n; i++) {
           long in = sc.nextLong();
           if(in%4==0){
               yon++;
           }else if(in %2 == 0){
               ni++;
           }else{
               zero++;
           }
        }

        //二の倍数は二個並べればOK
        //ni = ni%2;
        //zaroは4が同じ数以上あればOK
        //もし2が一つもなければ4を一つ稼げる
        if(ni==0){
            yon++;
        }
        if(zero > yon){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
        
        
    }
    
    
}

