import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] k = new int[m];
        int[][] s = new int[m][];
        for (int i=0;i<m;i++){
            k[i] = scanner.nextInt();
            s[i] = new int[k[i]];
            for (int j=0;j<k[i];j++){
                s[i][j] = scanner.nextInt();
            }
        }
        int[] p = new int[m];
        for (int i=0;i<m;i++){
            p[i] = scanner.nextInt();
        }
        int countAnswer = 0;
        for (int i=0;i<Math.pow(2,n);i++){
            String str = Integer.toBinaryString(i);
            while (str.length()<n){
                str = "0" + str;
            }
            int count1 = 0;
            for (int j=0;j<m;j++){
                int count2 = 0;
                for (int a=0;a<n;a++){
                    boolean b = false;
                    for (int bo=0;bo<s[j].length&&!b;bo++){
                        if (s[j][bo]==a+1){
                            b = true;
                        }
                    }
                    if (str.charAt(a)=='1'&&b)count2++;
                }
                if (count2%2==p[j])count1++;
            }
            if (count1==m)countAnswer++;
        }
        System.out.println(countAnswer);
    }
}