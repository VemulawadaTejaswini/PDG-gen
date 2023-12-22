import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner  yomi = new Scanner(System.in);
        int[] n = new int[yomi.nextInt()];
        int k = yomi.nextInt();
        for (int i=0;i<n.length;i++){
            n[i] = yomi.nextInt();
        }
        Arrays.sort(n);
        int goukei = 0;
        for (int i=0;i<k;i++){
            goukei += n[i];
        }
        System.out.println(goukei);
        }

}