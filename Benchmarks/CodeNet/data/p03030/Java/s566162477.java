import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Pair[] score = new Pair[n];
        for(int i=0;i<n;i++){
            score[i] = new Pair(sc.next(),Integer.parseInt(sc.next()),i+1);
        }

        Arrays.sort(score,new Comparator<Pair>() {

            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.key.compareTo(o2.key)==0){
                    return o2.val-o1.val;
                }else{
                    return o1.key.compareTo(o2.key);
                }
            }
        });
        for(int i=0;i<n;i++){
            System.out.println(score[i].num);
        }
    }
}
class Pair{
    String key;
    int val;
    int num;
    Pair(String key,int val,int num){
        this.key = key;
        this.val = val;
        this.num = num;
    }
}