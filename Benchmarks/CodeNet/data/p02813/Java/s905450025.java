import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        int[] Q = new int[N];
        ArrayList<Integer> Pnumlist = new ArrayList<Integer>();
        ArrayList<Integer> Qnumlist = new ArrayList<Integer>();
        int[] fact = new int[N];

        fact[0] = 1;
        for(int i =1; i <N;i++){
            fact[i] = fact [i-1] * i;
        }
        for(int i=0;i<N;i++){
            Pnumlist.add(i+1);
            Qnumlist.add(i+1);
        }

        for(int i =0;i<N;i++){
            P[i] = sc.nextInt();
        }

        for(int i=0;i<N;i++){
            Q[i] = sc.nextInt();
        }

        int Pans =1;
        int Qans =1;
        for(int i=0;i<N;i++){
            Pans += fact[N-i-1] * (Pnumlist.indexOf(P[i]));
            Pnumlist.remove(Pnumlist.indexOf(P[i]));
            Qans += fact[N-i-1] * (Qnumlist.indexOf(Q[i]));
            Qnumlist.remove(Qnumlist.indexOf(Q[i]));

        }



        System.out.println(Math.abs(Pans-Qans));


    }

}
