import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] A = new long[N];
        for(int i = 0; i < N; i++) A[i] = sc.nextLong();
        int[] cnt = new int[50];
        // Aの各桁に1がいくつ立っているか数える
        for(int i = 0; i < 50; i++){
            for(int j = 0; j < N; j++){
                cnt[i] += (A[j] >> i) & 1;
            }
        }
        long ans = 0;
        boolean free = false;
        for(int i = 49; i >= 0; i--){
            // Kのｉ桁目が１の場合、ｉ桁目は１でも０でもよく、
            // Ａのｉ桁目に１が立っている方が少なければｉ桁目は１を立てる
            // Ａのｉ桁目に１が立っている方が多ければ（同数含む）ｉ桁目は０とする
            // ｉ桁目を０とすると、ｉ-１桁目以降は１でも０でも自由に選べる
            if(((K >> i) & 1) == 1L){
                if(cnt[i] < N - cnt[i]){
                    ans += Math.pow(2, i) * (N - cnt[i]);
                }else{
                    ans += Math.pow(2, i) * cnt[i];
                    free = true;
                }
            }else{
                // Kのｉ桁目が０の場合、それまでに自由に選べるようになっていなければ０しか選べない
                if(free){
                    ans += Math.pow(2, i) * Math.max(cnt[i], N - cnt[i]);
                }else{
                    ans += Math.pow(2, i) * cnt[i];
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }

}
