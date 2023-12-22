import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    static int rank1 = -1;
    static int rank2 = -1;
    static int rank3 = -1;
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i < 10; i ++) {

            try {
                int readVal = Integer.parseInt(br.readLine());
                updateRank(readVal);

            } catch (Exception e) {
            }
        }
        System.out.println(rank1);
        System.out.println(rank2);
        System.out.println(rank3);
    }

    static void updateRank(int rank) {

        if (rank > rank1) {
            rank3 = rank2;
            rank2 = rank1;
            rank1 = rank;
        }
        else if ( rank > rank2) {
            rank3 = rank2;
            rank2 = rank;
        }
        else if (rank > rank3) {
            rank3 = rank;
        }
    }
}