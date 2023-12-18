import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] stringList = new String[n];
        byte[][] number = new byte[n][26];
        for (int i=0;i<n;i++){
            stringList[i] = scanner.next();
            for (int j=0;j<10;j++){
                number[i][stringList[i].charAt(j)-'a']++;
            }
        }
        int count = 0;
        boolean b;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                b = true;
                for (int k=0;k<26&&b;k++){
                    if (number[i][k]!=number[j][k]) b = false;
                }
                if (b)count++;
            }
        }
        System.out.println(count);
    }
}
