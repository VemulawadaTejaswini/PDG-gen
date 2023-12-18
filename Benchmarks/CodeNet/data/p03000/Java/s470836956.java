import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int count = 0;
        ArrayList<Integer> L = new ArrayList<>();
        ArrayList<Integer> D = new ArrayList<>();
        D.add(0);

        for (int i = 0; i < N; i++){
            L.add(sc.nextInt());
        }

        for (int i = 1; i < N + 1; i++){
            D.add(D.get(i-1) + L.get(i-1));
        }

        for (int i = 0; i < D.size(); i++){
            if(D.get(i)<=X){
                count++;
            }
        }

        System.out.print(count);
        sc.close();
    }

}