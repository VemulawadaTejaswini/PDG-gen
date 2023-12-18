import java.io.*;

class InputCreate{
    static int N = 100000;

    static int bottom = 1;
    static int top = 100000;
    static int randNum = N;
    
    public static void main(String[] args) {
        PrintWriter fw = null;
        try{
            fw = new PrintWriter(new BufferedWriter(new FileWriter("_input.txt")));
        }catch(Exception e){}
        
        // //1行目に N を出力
        // fw.println(N);
        
        // // //bottom〜topの乱数を1回出力
        // int rand;
        // // rand = (int)(Math.random() * top) + bottom;
        // // fw.println(rand);

        
        //tmp
        fw.println(N);
        fw.println(N);
        
        //N文字のstrのいずれかからなるランダム文字列を出力
        StringBuilder sb = new StringBuilder();
        String str = "ACGT";
        for(int i = 0; i < N; i++){
            int randIndex = (int)(Math.random() * str.length());
            sb.append(str.charAt(randIndex));
        }
        fw.println(sb.toString());
        
        //bottom〜topの乱数を N 回出力
        for(int i = 0; i < 3*N; i++){
            int rand = (int)(Math.random() * top) + bottom;
            fw.println(rand);
            if(i%2 != 1){
                bottom += rand+1;
                top -= rand+1;
            }
            else{
                bottom = 1;
                top = 100000;
            }
        }

    }
}