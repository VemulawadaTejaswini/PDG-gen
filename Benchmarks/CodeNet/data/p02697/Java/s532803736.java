import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> primeList = getPrimeList(n);
        HashSet<Integer> hs = new HashSet<Integer>();
        int p = 0;
        int prev = 0;
        int index = 0;
        for(int i = 1; i <= m; i++){
            int first = (prev+1) % n;
            if(first == 0) first = n;
            hs.add(first);
            if(i == 1){
                p = 1;
            }else{
                while(true){
                    p = primeList.get(index);
                    int tmp = (first+p) % n == 0 ? n : (first+p) % n;
                    if(hs.contains(tmp)){
                        index++;
                        if(index >= primeList.size()){
                            index = 0;
                        }
                        continue;
                    }else{
                        break;
                    }
                }
            }
            int rival = (first+p) % n;
            if(rival == 0) rival = n;
            hs.add(rival);
            System.out.println(first + " " +rival);
            prev = rival;
        }
    }
    
    private static ArrayList<Integer> getPrimeList(int l){
        ArrayList<Integer> ret = new ArrayList<Integer>();
        ret.add(2);
        for(int i = 3; i < l; i += 2){
            boolean bool = true;
            for(int p : ret){
                if(i % p == 0){
                    bool = false;
                    break;
                }
            }
            if(bool) ret.add(i);
        }
        return ret;
    }
}
