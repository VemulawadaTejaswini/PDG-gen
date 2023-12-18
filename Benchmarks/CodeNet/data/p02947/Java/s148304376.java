import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char s[][] = new char[n][10];
        for (int i=0; i<n; i++) s[i] = sc.next().toCharArray();

        Arrays.sort(s, (a, b) -> Character.compare(a[0], b[0]));
//        for (int i=0; i<n; i++) Arrays.sort(s[i]);
        int count = 0;

        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (comp(s[i], s[j])){
                    count++;
                }else{
                    continue;
                }
            }
        }

        System.out.print(count);
    }
    public static boolean comp(char[] c1, char []c2){

        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)){
            return true;
        }else{
            return false;
        }
    }


}