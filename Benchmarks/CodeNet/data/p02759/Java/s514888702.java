import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[][] bingo = new int[3][3];
        // bingoの入力値をセット
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                bingo[i][j] = Integer.parseInt(scanner.next());
            }
        }
        // 選んだ数
        int count = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        // 選んだ数の内容を取得
        for(int i=0; i<count; i++){
            list.add(scanner.nextInt());
        }
        scanner.close();
        // bingoから探す
        int[][] result = new int[9][9];
        int count0 = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(list.contains(bingo[i][j])){
                    result[i][j] = 1;
                    count0 += 1;
                }else{
                    result[i][j] = 0;
                }
            }
        }
        if(count0 < 3){
            System.out.println("No");
            return;
        }
        //縦チェック
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(result[i][j]==1){
                    count1 += 1;
                }
                if(count1==3){
                    System.out.println("Yes");
                    return;
                }
                if(result[j][i]==1){
                    count2 += 1;
                }
                if(count2==3){
                    System.out.println("Yes");
                    return;
                }
                if(result[i][i]==1){
                    count3 += 1;
                }
                if(count3==3){
                    System.out.println("Yes;");
                    return;
                }
                if(result[0][2]==1 && result[1][1]==1 && result[2][0]==1){
                    count4 += 1;
                }
                if(count4==3){
                    System.out.println("Yes");
                    return;
                }
            }
            count1 = 0;
            count2 = 0;
            count3 = 0;
            count4 = 0;
        }
        System.out.println("No");
    }
}