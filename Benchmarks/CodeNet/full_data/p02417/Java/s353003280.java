import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String word = null;
        int[] cnt = new int[26];
        for (int i = 0; i < cnt.length; i++ )
            cnt[i] = 0;
        while(input.hasNext()){
            word = input.nextLine();
            char[] words = word.toCharArray();
            store(words, cnt);
        }
        for(int j = 0; j < cnt.length; j ++){
            System.out.println((char)('a' + j) + " : " + cnt[j]);
        }
    }
    
    public static void store(char[] w, int[] c){
        int temp = 0;
        for(int i = 0; i < w.length; i ++){
            if(w[i] <= 'z' && w[i] >= 'a'){
                temp = w[i] - 'a';
                c[temp] ++;
            }
            else if(w[i] <= 'Z' && w[i] >= 'A'){
                temp = w[i] - 'A';
                c[temp] ++;
            }
        }
    }
}
