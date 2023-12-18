import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }



    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        sc.close();

        String s;
        ArrayList<Integer> rlist = new ArrayList<>();
        ArrayList<Integer> glist = new ArrayList<>();
        ArrayList<Integer> blist = new ArrayList<>();
        for(int i=0; i<S.length(); i++){
            s = String.valueOf(S.charAt(i));
            if(s.equals("R")){
                rlist.add(i+1);
            }
            else if(s.equals("G")){
                glist.add(i+1);
            }
            else if(s.equals("B")){
                blist.add(i+1);
            }
        }
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: rlist){
            for(int j: glist){
                for(int k: blist){
                    int min, mid, max;
                    if(i < j){
                        if(i<k){
                            min = i;
                            if(j < k){
                                mid = j;
                                max = k;
                            }
                            else {
                                mid = k;
                                max = j;
                            }
                        }
                        else {
                            min = k;
                            max = j;
                            mid = i;
                        }
                    }
                    else{
                        if(j<k){
                            min = j;
                            if(i < k){
                                mid = i;
                                max = k;
                            }
                            else {
                                mid = k;
                                max = i;
                            }
                        }
                        else {
                            min = k;
                            max = i;
                            mid = j;
                        }
                    }
                    if(Math.abs(mid - min) != Math.abs(max - mid)){
                        sum += 1;
                    }
                    
                    
        
                }
            }
        }
        System.out.println(sum);

    }

}    

