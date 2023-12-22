import java.util.*;

public class Main {
    public static void main(String[] args){
        HashMap <Integer, Integer> dist = new HashMap <Integer, Integer>();
        HashMap <Integer, Boolean> reach = new HashMap <Integer, Boolean>();
        Queue <Integer> q = new ArrayDeque <Integer>();
        final int[] tens = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        q.add(1234567);
        dist.put(1234567, 0);
        reach.put(1234567, true);
        while(!(q.isEmpty())){
            int v = q.poll();
            int d = dist.get(v);
            int div[] = new int[8];
            int st = 0;
            int tar[] = new int[3];
            for(int i = 0; i<8; i++){
                div[i] = getDigit(v, i+1);
                if(div[i] == 0) st = i;
            }
            if(st < 4){
                if(st == 1 || st == 2){
                    tar[0] = st-1;
                    tar[1] = st+1;
                    tar[2] = st+4;
                }else if(st == 0){
                    tar[0] = st+1;
                    tar[1] = st+4;
                    tar[2] = st;
                }else{
                    tar[0] = st-1;
                    tar[1] = st+4;
                    tar[2] = st;  
                }
            }else{
                if(st == 5 || st == 6){
                    tar[0] = st-1;
                    tar[1] = st+1;
                    tar[2] = st-4;
                    
                }else if(st == 4){
                    tar[0] = st+1;
                    tar[1] = st-4;
                    tar[2] = st;
                }else{
                    tar[0] = st-1;
                    tar[1] = st-4;
                    tar[2] = st;
                }
            }
            for(int nv : tar){
                if(nv == st) break;
                int p = 0;
                for(int i = 0; i<8; i++){
                    if(i == st){
                        p += div[nv]*tens[7-i];
                    }else if(i == nv){
                        p += div[st]*tens[7-i];
                    }else{
                        p += div[i]*tens[7-i];
                    }
                }
                if(reach.get(p) == null){
                    q.add(p);
                    reach.put(p, true);
                    dist.put(p, d+1);
                }
            }
            
        }

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int in = 0;
            for(int i = 0; i<8; i++){
                in += sc.nextInt() * tens[7-i];
            }
            System.out.println(dist.get(in));
        }
        sc.close();
    }
    static int getDigit(int N, int M){
        switch(M) {
            case 1:
            return N / 10000000 %10;
            
            case 2:
            return N / 1000000 % 10;
            
            case 3:
            return N / 100000 % 10;
            
            case 4:
            return N / 10000 % 10;
            
            case 5:
            return N / 1000 % 10;
            
            case 6:
            return N / 100 % 10;
            
            case 7:
            return N / 10 % 10;

            case 8:
            return N % 10;

            default:
            return 0;

        }
    }
    
}
