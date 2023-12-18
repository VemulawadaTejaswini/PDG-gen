import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        List<List<Integer>> Mojis = new ArrayList<>();
        for(int i=0;i<3;i++){Mojis.add(new ArrayList<>());}
        for(int i=0;i<N;i++){
            int tgt = -1;
            switch(S[i]){
                case 'R':
                    tgt = 0;
                    break;
                case 'G':
                    tgt = 1;
                    break;
                case 'B':
                    tgt = 2;
                    break;
            }
            Mojis.get(tgt).add(i);
        }
        List<List<Integer>> l = Arrays.asList(Arrays.asList(0,1,2),
                Arrays.asList(0,2,1),
                Arrays.asList(1,2,0),
                Arrays.asList(1,0,2),
                Arrays.asList(2,1,0),
                Arrays.asList(2,0,1));
        long cnt=0;
        for(List<Integer> perm:l){
            List<Integer> R = Mojis.get(perm.get(0));
            List<Integer> G = Mojis.get(perm.get(1));
            List<Integer> B = Mojis.get(perm.get(2));
            cnt += calc(R, G, B);
        }
        System.out.println(cnt);

    }
    private static long calc(List<Integer> R, List<Integer> G, List<Integer> B){
        long sum = 0;
        for(Integer r: R){
            int find = findIndexMoreThan(G, r);
            for(int gind = find; gind < G.size();gind++){
                Integer g = G.get(gind);
                int ind = findIndexMoreThan(B, g);
                sum += (B.size()-ind);
                if(hasTarget(B,2*g-r)){
                    sum--;
                }
            }
        }
        return sum;
    }

    private static int findIndexMoreThan(List<Integer> lst, int tgt){
        int l=0;
        int r=lst.size()-1;
        while(l < r){
            int m=(l+r)/2;
            if(lst.get(m) <= tgt){
                l=m+1;
            }else{
                r=m;
            }
        }
        if(lst.get(l) <= tgt){
            return lst.size();
        }
        return l;
    }

    private static boolean hasTarget(List<Integer> lst, int tgt){
        int l=0;
        int r=lst.size()-1;
        while(l<r){
            int m=(l+r)/2;
            if(lst.get(m) < tgt){
                l=m+1;
            }else{
                r=m;
            }
        }
        if(lst.get(l) == tgt){
            return true;
        }else{
            return false;
        }
    }
}
