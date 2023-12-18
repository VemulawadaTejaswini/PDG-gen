import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> arr = new ArrayList<>();
    static String[][] dpTable;
    static boolean[][] used;
    static void dp(int i, int k){
        String entry_in_table;
        if(i == arr.size() && k == 0)
            entry_in_table = "";
        else if(k == 0){
            entry_in_table = "";
        }
        else if(i == arr.size())
            entry_in_table = null;
        else {
            String s = arr.get(i);

            if(used[i][k]){
                return;
            }

            if(s.length() > k){
                dp(i+1, k);
                entry_in_table = dpTable[i+1][k];
            } else {
                dp(i + 1, k);
                dp(i + 1, k-s.length());
                String s1 = dpTable[i+1][k];
                String s2 = dpTable[i+1][k-s.length()];

                if (s1 == null && s2 == null){
                    entry_in_table =  null;
                }else if(s1 == null)
                    entry_in_table = s + s2;
                else if(s2 == null)
                    entry_in_table = s1;
                else if(s1.compareTo(s + s2) < 0){
                    entry_in_table = s1;
                } else{
                    entry_in_table = s + s2;
                }
            }
        }
        dpTable[i][k] = entry_in_table;
        used[i][k] = true;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        used = new boolean[n+1][k+1];
        dpTable = new String[n+1][k+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<k+1; j++){
                dpTable[i][j] = null;
            }
        }
        for(int i =0; i< n; i++){
            arr.add(kb.next());
        }
        dp(0, k);
        System.out.println(dpTable[0][k]);
    }
}
