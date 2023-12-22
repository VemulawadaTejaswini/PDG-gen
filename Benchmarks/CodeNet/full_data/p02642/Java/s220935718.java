import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++) a.add(scan.nextInt());
        int out = n;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(a.get(i) % a.get(j) == 0 && i != j){
                    out--;
                    break;
                }
            }
        }
        System.out.println(out);
        scan.close();
    }
}