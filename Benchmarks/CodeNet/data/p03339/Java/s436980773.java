import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        int min = 9999;
        int[] integer = new int[n+1];
        integer[0]=0;
        for (int i=0;i<n;i++){
            if (str.charAt(i)=='W'){
                integer[i+1]=integer[i]+1;
            }else {
                integer[i+1]=integer[i];
            }
        }
        for (int i=0;i<n;i++){
            min = Math.min(min,integer[i]-integer[0]-integer[n]+integer[i+1]+n-1-i);
        }
        System.out.println(min);
    }
}
