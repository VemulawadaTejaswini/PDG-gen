import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[101];
        int n;
        int max =0;
        while (sc.hasNext()){
            n =sc.nextInt();
            Array[n]++;
            if (max < Array[n])max = Array[n];
            }
                for (int i =0;i<Array.length;i++){
                    if (Array[i]==max){
                        System.out.println(i);
                    }
                }
            }
}