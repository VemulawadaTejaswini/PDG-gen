import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //arrays.sortで降順にするときはプリミティブ型だと使用不可
        Integer[]p = new Integer[N];
        int sum = 0;
        for(int i = 0; i < N; i++){
            p[i] = sc.nextInt();
        }
        //降順に並べる
        Arrays.sort(p, Comparator.reverseOrder());
        p[0] = p[0] / 2;
        for(int i = 0; i < N; i++){
            sum = sum + p[i];
        }
        System.out.println(sum);
    }
}