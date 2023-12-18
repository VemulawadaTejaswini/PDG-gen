import java.util.*;  //B問題

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int N = Integer.parseInt(line);
        //int[] C = new int[N];
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            line = scan.nextLine();
            //C[i] = Integer.parseInt(line);
            list.add(Integer.parseInt(line));
        }
        ArrayList<Integer> list_kind = new ArrayList<>(new HashSet<>(list));
        int[] count = new int[list_kind.size()];
       
        for (int i = 0; i < N; i++) {
            for (int j = 2; j < N-i; j++) {
                for (int k = 0; k < list_kind.size(); k++) {
                    if (list.get(i) == list_kind.get(k) && list.get(i) == list.get(i+j)) {
                        count[k]++;
                        j++;
                    }
                }
            }
        }
        
        long num = 1;  //何も入れ替えない1通り
        for (int k = 0; k < list_kind.size(); k++) {
            num += count[k];
        }
        num %= 1000000007;
        System.out.println(num);
    }
}
