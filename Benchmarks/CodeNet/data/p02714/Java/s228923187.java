import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String v = scan.next();
        char[] S = v.toCharArray();
        long sum = 0;
        List<Integer> posR = new ArrayList<>();
        List<Integer> posG = new ArrayList<>();
        List<Integer> posB = new ArrayList<>();

        for (int i = 0; i < S.length; i++) {
            if(S[i] == 'R'){
                posR.add(i);
            }else if(S[i] == 'G'){
                posG.add(i);
            }else{
                posB.add(i);
            }
        }

        int cnt = 0;
        for (int i = 0; i < posB.size(); i++) {
            for (int j = 0; j < posG.size(); j++) {
                for (int k = 0; k < posR.size(); k++) {
                    int bb = posB.get(i);
                    int gg = posG.get(j);
                    int rr = posR.get(k);

                    if(bb > gg && bb > rr){
                        if(gg> rr){
                            if(bb-gg == gg -rr){
                                cnt++;
                            }
                        }else{
                            if(bb-rr == rr-gg){
                                cnt++;
                            }
                        }
                    }else if(gg > bb && gg > rr){
                        if(bb > rr){
                            if(gg-bb == bb-rr){
                                cnt++;
                            }
                        }else{
                            if(gg-rr == rr-bb){
                                cnt++;
                            }
                        }
                    }else if(rr > bb && rr > gg){
                        if(gg > bb){
                            if(rr-gg == gg-bb){
                                cnt++;
                            }
                        }else{
                            if(rr-bb == bb-gg){
                                cnt++;
                            }
                        }
                    }
                }
            }
        }

        long p = posB.size() * posG.size() * posR.size() - cnt;
        System.out.println(p);
    }
}
