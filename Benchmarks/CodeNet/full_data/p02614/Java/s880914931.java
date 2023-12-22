import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();

        char[][] c = new char[h][w];
        for(int i = 0; i < h; i++){
            c[i] = (sc.next()).toCharArray();
        }

        int[] sel = new int[h + w];
        int count = 0;
        int num = 0;
        for(int l = 0; l < Math.pow(2, h + w); l++){
            for(int i = 0; i < h; i++){
                if(sel[i] == 0){
                    for(int j = 0; j < w; j++){
                        if(sel[j + h] == 0 && c[i][j] == '#'){
                            num++;
                        }
                    }
                }
            }
            if(num == k){
                count++;
            }
            sel = succ(sel);
            num = 0;
        }

        System.out.println(count);
        sc.close();
    }

    static int[] succ(int[] bin){
        int i = 0;
        while(i < bin.length && bin[i] != 0){
            bin[i] = 0;
            i++;
        }
        if(i < bin.length){
            bin[i] = 1;
        }

        return bin;
    }
}