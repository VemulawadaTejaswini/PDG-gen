import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kosuke on 2014/07/06.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, p;
        while ((n = scan.nextInt()) != 0 && (p = scan.nextInt()) != 0) {
            int cup_stone = p;
            boolean flag = false;
            ArrayList<Integer> candidate = new ArrayList<Integer>();
            for(int i=0; i<n; i++){
                candidate.add(0);
            }

            for(int i=0; i<n; i++){
                if(cup_stone != 0) {
                    candidate.set(i, (candidate.get(i)) + 1);
                    cup_stone -= 1;
                    if(i == n-1) {
                        i = -1;
                    }
                    continue;
                }

                for(int j=0; j<n; j++){
                    if(candidate.get(j) > 0 && candidate.get(j) < p){
                        cup_stone = candidate.get(i);
                        candidate.set(i,0);
                        break;
                    }
                    else if(candidate.get(j) == p){
                        System.out.println(j);
                        flag = true;
                        break;
                    }
                }
                if(flag == true){
                    break;
                }
                if(i == n-1) {
                    i = -1;
                }
            }
        }
    }
}