import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //num of arrays
        Integer mountain[] = new Integer[N]; // array
        for (int i=0; i<N; i++) {
            mountain[i] = sc.nextInt();
        }
        int maxhight = 0;
        int seeview = 0;
        for (int i = 0; i< N; i++){
            if (maxhight <= mountain[i]) {
                seeview++;
                maxhight = mountain[i];
            }
        }
        System.out.println(seeview);
    }
}