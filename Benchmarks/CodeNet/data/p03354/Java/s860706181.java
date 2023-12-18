import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p[] = new int[n];
        for (int i = 0;i < n;++i){
            p[i] = sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> connects = new ArrayList<>();

        int c = 1;
        for (int i = 0;i < m;++i){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int xp = -1;
            int yp = -1;
            for (int j = 0;j < connects.size();++j){
                if(connects.get(j).contains(x)){
                    xp = j;
                }
                if(connects.get(j).contains(y)){
                    yp = j;
                }
            }

            if(xp == -1&&yp == -1){
                ArrayList<Integer> ee = new ArrayList<>();
                ee.add(x);
                ee.add(y);
                connects.add(ee);
            }
            else if(xp == -1){
                connects.get(yp).add(x);
            }
            else if(yp == -1){
                connects.get(xp).add(y);
            }
            else{
                connects.get(xp).addAll(connects.get(yp));
                connects.remove(yp);
            }
        }
        int total = 0;
        for (ArrayList<Integer> e:connects){
            for (int j = 0;j < e.size();++j){
                for (int k:e){
                    if(p[e.get(j) - 1] == k){
                        ++total;
                    }
                }
            }
        }

        System.out.println(total);
    }







}