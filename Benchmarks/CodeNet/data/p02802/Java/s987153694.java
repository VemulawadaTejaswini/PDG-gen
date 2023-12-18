import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[M];
        String[] S = new String[M];

        for(int i=0; i<M; i++){
            p[i] = sc.nextInt();
            S[i] = sc.next();
        }

        int penalty = 0;

        List<Integer> ACed = new ArrayList<>();
        for(int i=0; i<M; i++){
            if(S[i].equals("AC")){
                ACed.add(p[i]);
            }
        }

        Set<Integer> temp = new HashSet<>(ACed);
        List<Integer> Aced = new ArrayList<>(temp);

        for(int i=0; i<Aced.size(); i++){
            for(int j=0; j<M; j++){
                if(Aced.get(i) == p[i] && S[i].equals("WA")){
                    penalty += 1;
                }else if(Aced.get(i) == p[i] && S[i].equals("AC")){
                    break;
                }
            }
        }

        System.out.println(Aced.size()+" "+ penalty);

    }
}
