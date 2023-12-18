import java.util.*;
public class Main {
    public static void main(String[] args){

        long NUM=1000000007;
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();
        int K=sc.nextInt();
        boolean[] access=new boolean[N];
        int [] pathnum=new int[N];
        ArrayList<Integer>[] path=new ArrayList[N];
        for(int i=0;i<N;i++){
            access[i]=false;
            path[i]=new ArrayList<>();
            pathnum[i]=0;
        }
        for(int i=0;i<N-1;i++){
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            path[a].add(b);
            path[b].add(a);
        }
        Stack<Integer>posHis=new Stack<>();
        Stack<Integer>posIndex=new Stack<>();
        int nowPos=0;
        int nowIndex=0;
        posHis.push(0);
        posIndex.push(0);
        pathnum[nowPos]=-1;
        long result=K;
        access[0]=true;
        main:
        while(!posHis.empty()){
            for(;nowIndex<path[nowPos].size();nowIndex++){
                if(!access[path[nowPos].get(nowIndex)]){
                    posHis.push(nowPos);
                    posIndex.push(nowIndex+1);
                    result=(result*(K-pathnum[nowPos]-2))%NUM;

                    nowPos=path[nowPos].get(nowIndex);
                    nowIndex=0;
                    access[nowPos]=true;
                    continue main;
                }
            }
            nowPos=posHis.pop();
            nowIndex=posIndex.pop();
            pathnum[nowPos]++;

        }
        System.out.println(result);

    }
}
