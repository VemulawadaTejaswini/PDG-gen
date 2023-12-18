import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        HashMap<Character, ArrayList<String>> hashMap = new HashMap<>();

        char[] prefixs = new char[5];
        prefixs[0] = 'M';
        prefixs[1] = 'A';
        prefixs[2] = 'R';
        prefixs[3] = 'C';
        prefixs[4] = 'H';

        long[] cnts = new long[5];

        for(int i=0; i<N; i++){
            char c = scanner.next().charAt(0);

            if(c == 'M'){
                cnts[0]++;
            }else if(c == 'A'){
                cnts[1]++;
            }else if(c == 'R'){
                cnts[2]++;
            }else if(c == 'C'){
                cnts[3]++;
            }else if(c == 'H'){
                cnts[4]++;
            }
        }

        long ans = 0;
        for(int i=0; i<3; i++){
            for(int j=i+1; j<4; j++){
                for(int k=j+1; k<5; k++){
                    ans += (cnts[i] * cnts[j] * cnts[k]);
                }
            }
        }

        System.out.println(ans);
    }
}
