import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> input = new ArrayList<>();
        int A = 0, k = 0;
        for(int i = 0; i < n; i++){
            A = sc.nextInt();
            if(i == 0){
                input.add(A);
            } else {
                while(k < input.size() && A < input.get(k)){
                    k++;
                }
                input.add(k, A);
                k = 0;
            }
        }
        ArrayList<Integer> ia = new ArrayList<>();
        int fel = 0, a = 0, max = 0, idx = 0;
        for(int i = 0; i < n; i++){
            if(i == 0){
                ia.add(input.get(0));
            } else{
                a = input.get(i);
                max = max(ia);
                idx = ia.indexOf(max);
                fel += max;
                if(max <= a){
                    ia.add(idx + 1, a); ia.add(idx + 2, a);
                } else {
                    if(idx == 0){
                        ia.add(idx + 1, Math.min(a, ia.get(ia.size() - 1)));
                    } else {
                        ia.add(idx + 1, Math.min(a, ia.get(idx - 1)));
                    }
                    if(idx == ia.size() - 1){
                        ia.add(idx + 2, Math.min(a, ia.get(0)));
                    } else {
                        ia.add(idx + 2, Math.min(a, ia.get(idx + 1)));
                    }
                    ia.remove(idx);
                }
            }
        }
        System.out.println(fel);
        sc.close();
        
    }
    static int max(ArrayList<Integer> ia){
        int ma = 0;
        for(int i = 0; i< ia.size(); i++){
            ma = Math.max(ma, ia.get(i));
        }
        return ma;
    }
}