import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> hs = new HashSet<Integer>();
        boolean revf = false;
        boolean revr = false;
        int prev = 0;
        for(int i = 1; i <= m; i++){
            int first = (prev+1);
            if(first > n){
                first = n-(first-n);
                revf = true;
            }
            while(hs.contains(first)){
                if(revf){
                    first--;
                    if(first <= 0){
                        first = 1;
                        revf = false;
                    }
                }else{
                    first++;
                    if(first > n){
                        first = n-(first-n);
                        revf = true;
                    }
                }
            }
            hs.add(first);
            int rival = first+i;
            if(rival > n){
                rival = n-(rival-n);
                revr = true;
            }
            while(hs.contains(rival)){
                if(revr){
                    rival--;
                    if(rival <= 0){
                        rival = 1;
                        revr = false;
                    }
                }else{
                    rival++;
                    if(rival > n){
                        rival = n-(rival-n);
                        revr = true;
                    }
                }
            }
            hs.add(rival);
            System.out.println(first + " " +rival);
            prev = rival;
        }
    }
}
