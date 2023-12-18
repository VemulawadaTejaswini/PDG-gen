import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        int n = yomi.nextInt();
        int ta[] = new int[n];
        int kaihuku = 0;
        for (int i=0;i<n;i++){
            ta[i]=yomi.nextInt();
        }
        for (int i = 0;i<n;i++){
            for (int j=0;i+j<n;j++){
                kaihuku += ta[i]*ta[i+j];
            }
        }
        System.out.println(kaihuku);
    }
}