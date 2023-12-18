import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //数
        //int[]b = new int[a]; //リンゴの味入れる配列
        int c = sc.nextInt(); //味初期値
        // int[] data = Taste(c, a, b);
        int[] data = Taste(c, a);
    
        //0に近いもの＝食べるものを決める
        int ans = Ans(data, a);
        System.out.println(ans);
        
    }

    // private static int[] Taste(int c,int a, int b[]){
    private static int[] Taste(int c,int a){
        int[]b = new int[a]; //リンゴの味入れる配列
        for(int i = 0; i < a; i++){
            //味入れていく
            b[i] = c + i;
        }
        return b;
    }

    //食べるもの決めたらその値0にしてすべて合算して返す
    private static int Ans(int data[], int a){
        //絶対値をとる（負の値対策）
        /*
        int[] data2 = data;
        https://eng-entrance.com/java-array-copy
        */
        //配列コピー
        int[] data2 = new int[a];
        for(int i = 0; i < data.length; i++){
            data2[i] = data[i];
            data2[i] = Math.abs(data2[i]);
        }

        /*上でまとめる
        for(int i = 0; i < a; i++){
            data2[i] = Math.abs(data2[i]);
        }
        */
        //これだと最後の足し算がおかしくなる
        //-3, -4が絶対値で3,4になるから。全て正の数なら問題ないけど
        Arrays.sort(data2);
        int noukin = data2[0];
        for(int i = 0; i < a; i++){
            //-noukinでよさそう
            if((noukin == data[i]) || ((noukin * -1) == data[i])){
                data[i] = 0;
                break;
            }
        }
        int ans = 0;
        for(int i = 0; i < a; i++){
            ans = ans + data[i];
        }
        return ans;
    }
}

