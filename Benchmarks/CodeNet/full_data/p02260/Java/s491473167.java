import java.io.*;
import java.util.*;



class Main{
    //読み込みのテンプレ(stringオブジェクトまで)
    
    static int N;
    static int[] sequence;
    static int count;
    
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int[] sequence = new int[N];
        
        //配列にsequenceを打ち込む
        for(int i=0;i<N;i++){
            sequence[i]=scanner.nextInt();
        }
        
        sequence =  doSelectsort(sequence);
        showResult(sequence);
        System.out.println(count);
    }
    
    
    public static int[] doSelectsort(int[] sequence){
        for(int i=0;i<sequence.length;i++){
            int minimum = i;
            for(int j= i+1;j<sequence.length;j++){
                if(sequence[minimum] > sequence[j]){
                    minimum = j;
                }
            }
            int x = sequence[i];
            int y = sequence[minimum];
            sequence[i]=y;
            sequence[minimum]=x;
            
            if(i!=minimum)count++;
        }
        return sequence;
    }
    
    
    //出力
    public static void showResult(int[] sequence){
        for(int i =0;i<sequence.length-1;i++){
            int number = sequence[i];
            System.out.print(number + " ");
        }
        
        System.out.println(sequence[sequence.length-1]);
    }
    
}