import java.util.*;

public class Main {
    public static class Pair implements Comparable<Pair>{
        int start;
        int end;
        
        void Pair(int x,int y){
            this.start=x;
            this.end=y;
        }
        
        public int compareTo(Pair p){
            return -p.end+this.end;
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        Pair[] allpair=new Pair[M];
        
        for(int i=0;i<M;i++){
            int tmp_start=sc.nextInt();
            int tmp_end=sc.nextInt();
            Pair tmp=new Pair();
            tmp.Pair(tmp_start,tmp_end);
            allpair[i]=tmp;
        }
        
        Arrays.sort(allpair);
        int ANS=0;

        int x=0;
        
        for(int i=0;i<M;i++){
            int tmp=allpair[i].end;
            if(x<allpair[i].start){
                ANS++;
                x=tmp-1;
            }else{
            }
        }
        
        System.out.println(ANS);
    }
}
