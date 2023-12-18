//package com.regular.arc065;


import java.util.Scanner;

public class Main {

    static class UnionFind{
        int count =0;
        int []id;
        int []dataCnt;
        public void init(int n){
            id=new int[n];
            dataCnt = new int[n];
            count=n;

            for(int i=0;i<n;i++){
                id[i]=i;
                dataCnt[i]=1;
            }

        }
        public int getDataCnt(int n){
            return dataCnt[id[n]];
        }
        public int getCount(){return count;}
        public int find(int p){return id[p];}
        public boolean isConnected(int p,int q){
            return (find(p)==find(q));
        }
        public void union(int p,int q){
            int pID = find(p);
            int qID = find(q);
            if(pID==qID) return;
            int tmp=0;
            for(int i=0;i<id.length;i++) {
                if (id[i] == pID) id[i] = qID;
                if (id[i]==qID) tmp++;
            }
            dataCnt[qID]=tmp;
            count--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int L = sc.nextInt();

        UnionFind road = new UnionFind();
        road.init(N);
        UnionFind rail = new UnionFind();
        rail.init(N);

        for(int i=0;i<K;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            road.union(a-1,b-1);
        }


        for(int i=0;i<L;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            rail.union(a-1,b-1);
        }


        for (int i=0;i<N;i++){
            int tmp = 0;
            for(int j=0;j<N;j++){
                if(road.isConnected(i,j)&&rail.isConnected(i,j)){
                    tmp++;
                }
            }
            if(i!=N-1)
                System.out.print(tmp+" ");
            else
                System.out.println(tmp);
        }


        sc.close();

    }

}
