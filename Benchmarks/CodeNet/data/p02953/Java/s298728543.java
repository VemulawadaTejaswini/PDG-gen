import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String a = sc.nextLine();
        int[] line = decompo(a);
        
        boolean able = check(line);
        
        if (able) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    // 分解してint配列に変換
    private static int[] decompo(String str) {
        String[] line = str.split(" ");
        int[] result = new int[line.length]; 
        for (int i = 0; i < line.length; i++) {
            result[i] = Integer.parseInt(line[i]);
        }
        
        return result;
    }
    
    // int配列を単調非減少にできるかチェック
    private static boolean check(int[] line) {
        boolean result = false;
        if (line.length > 1) {
            for (int i = 1; i < line.length; i++) {
                if (line[i] == line[i - 1] || (line[i] - 1) == line[i - 1] || (line[i] - 1) > line[i - 1]) {
                    result = true;
                } else {
                    result = false;
                    return result;
                }
            }
        } else {
            result = true;
        }
        
        return result;
    }
}
