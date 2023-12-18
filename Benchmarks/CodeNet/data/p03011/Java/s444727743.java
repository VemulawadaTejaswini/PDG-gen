import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = 3;
        int[]a = new int[3];
        for(int i = 0; i < number; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        //昇順に並び替え
        Arrays.sort(a);
        System.out.println(a[0] + a[1]);
    }
}