import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //人数
        int m = sc.nextInt(); //友達関係数
        int g = 1; //グループナンバー
        int m_x = 0;
        int guru[] = new int[n+1]; //どのグループに属すか
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Set<Integer> set = new HashSet<Integer>();
        
        list.add(new ArrayList<Integer>()); //get(0)は空入力しておく
        
        for(int i=0;i<m;i++){
            int a = sc.nextInt(); 
            int b = sc.nextInt();
            
            if(guru[a]==0 && guru[b]==0){ //どちらもグループに属していない
                guru[a]=g;guru[b]=g;
                ArrayList<Integer> minilist = new ArrayList<Integer>();
                minilist.add(a);
                minilist.add(b);
                list.add(minilist);
                set.add(g++);
            }else if(guru[a]==0 || guru[b]==0){ //どちらかがグループに属していない
                if(guru[a]==0){//aがグループに属していない
                    guru[a]=g;
                    ArrayList<Integer> minilist = new ArrayList<Integer>();
                    ArrayList<Integer> translist = list.get(guru[b]);
                    set.remove(guru[b]);
                    minilist.add(a);
                    for(int j : translist){
                        minilist.add(j);
                        guru[j]=g;
                    }
                    list.add(minilist);
                    set.add(g++);
                }else{//bがグループに属していない
                    guru[b]=g;
                    ArrayList<Integer> minilist = new ArrayList<Integer>();
                    ArrayList<Integer> translist = list.get(guru[a]);
                    set.remove(guru[a]);
                    minilist.add(b);
                    for(int j : translist){
                        minilist.add(j);
                        guru[j]=g;
                    }
                    list.add(minilist);
                    set.add(g++);
                }
            }else{//どちらもグループに属している
                if(guru[a]==guru[b])continue;
                ArrayList<Integer> minilist = new ArrayList<Integer>();
                ArrayList<Integer> translist1 = list.get(guru[b]);
                ArrayList<Integer> translist2 = list.get(guru[a]);
                set.remove(guru[a]);
                set.remove(guru[b]);
                for(int j : translist1){
                    minilist.add(j);
                    guru[j]=g;
                }                
                for(int j : translist2){
                    minilist.add(j);
                    guru[j]=g;
                }
                list.add(minilist);
                set.add(g++);
            }
        }
        for(int ret : set){
            ArrayList<Integer> minilist = list.get(ret);
            if(m_x < minilist.size())m_x=minilist.size();
        }
        System.out.println(m_x);
    }
}
