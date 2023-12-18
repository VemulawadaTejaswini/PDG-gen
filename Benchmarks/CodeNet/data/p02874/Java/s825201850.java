import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Question[] qArray = new Question[N];
        for(int i = 0; i < N; i++){
            Question q = new Question();
            long s = sc.nextLong();
            long e = sc.nextLong();
            long d = e - s;
            q.start = s;
            q.end = e;
            q.diff = d;
            qArray[i] = q;
        }
        Arrays.sort(qArray, (a, b) -> a.diff - b.diff > 0 ? -1 : 1);
        
        long ps = qArray[0].start;
        long pe = qArray[0].end;
        long diffArray[] = new long[N];
        diffArray[0] = pe - ps + 1;
        boolean maxFlg = false;
        for(int i = 1; i < N; i++){
            long s = qArray[i].start;
            long e = qArray[i].end;
            if(ps < s){
                ps = s;
            }
            if(e < pe){
                pe = e;
            }
            if(pe < ps){
                maxFlg = true;
                break;
            }
            diffArray[i] = pe - ps + 1;
        }
        if(!maxFlg){
            long es = qArray[N - 1].start;
            long ee = qArray[N - 1].end;
            long ediff = ee - es;
            long result = ediff + diffArray[N - 2] + 1;
            for(int i = N - 2; i > 0; i--){
                long s = qArray[i].start;
                long e = qArray[i].end;
                if(es < s){
                    es = s;
                }
                if(e < ee){
                    ee = e;
                }
                ediff = ee - es + 1 + diffArray[i - 1];
                if(result < ediff){
                    result = ediff;
                }
            }
            System.out.println(result);
        }else{
            System.out.println(qArray[0].diff);
        }
        
    }
    private static class Question{
        public long diff;
        public long start;
        public long end;
    }
}
