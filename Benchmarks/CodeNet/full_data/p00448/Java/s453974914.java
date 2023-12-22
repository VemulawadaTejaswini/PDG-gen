
import java.util.Scanner;

/**
 * Created by chinalife on 2019/8/21.
 */
public class Main{
    public static int res = Integer.MIN_VALUE;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            res = Integer.MIN_VALUE;
            String hanglie = sc.nextLine();
            String[] hangs = hanglie.split(" ");
            int hang = Integer.valueOf(hangs[0]);
            int lie = Integer.valueOf(hangs[1]);
            if(hang== 0 && lie == 0){
                return;
            }
            int[][] inputArr= new int[hang][lie];
            for(int i = 0;i<hang;i++){
                String input = sc.nextLine();
                String[] strings = input.split(" ");
                for(int j = 0;j < lie;j++){
                    inputArr[i][j] = Integer.valueOf(strings[j]);
                }
            }
            solve(inputArr,hang,lie);
            System.out.println(res);
        }
    }
    public static void solve(int[][] arr,int hang,int lie){
        for(int i = 0;i<(1<<hang);i++){
            for(int j = 0;j<hang;j++){
                if((i&(1<<j)) != 0){
                    flipArr(arr,j);
                }
            }
            int temp = 0;
            for(int j = 0;j<lie;j++){
                int flag = 0;
                for(int k = 0;k<hang;k++){
                    if(arr[k][j] == 1){
                        flag++;
                    }
                }
                temp+=Math.max(flag,hang-flag);
            }
            res = Math.max(temp,res);
            for(int j = 0;j<hang;j++){
                if((i&(1<<j)) != 0){
                    flipArr(arr,j);
                }
            }
        }
    }
    public static void flipArr(int[][] arr,int hang){
        for(int i = 0;i < arr[0].length;i++){
            if(arr[hang][i] == 0){
                arr[hang][i]= 1;
            }else{
                arr[hang][i]= 0;
            }
        }
    }
}

