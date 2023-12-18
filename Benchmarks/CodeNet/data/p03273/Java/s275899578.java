import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        List<String>temp = new ArrayList<>();
        int y = 0;//1行目の数値は受け取り、空白しか残ってないため2行目から読み取るため1行目はスキップ
        while(scanner.hasNextLine()){
            String temp1 = scanner.nextLine();
            if(y>=1){
                temp.add(temp1);
            }
            y++;
        }
        scanner.close();
        char[][] temp2 = new char[h][w];
        //配列に詰める、横の判定、全て.の場合削除
        for(int i=0;i<temp.size();i++){
            boolean isSharp = false;
            for(int x=0;x<w;x++){
                temp2[i][x]=temp.get(i).charAt(x);
                if(temp2[i][x] == '#'){
                    isSharp = true;
                }
            }
            if(!isSharp){
                for(int z=0;z<w;z++){
                temp2[i][z]='a';
                }
            }
        }
        //縦の判定、全て.の場合削除
        for(int ww=0;ww<w;ww++){
            boolean isSharp = false;
            for(int hh=0;hh<h;hh++){
                if(temp2[hh][ww] == '#'){
                    isSharp = true;
                }
            }
            if(!isSharp){
                for(int z=0;z<h;z++){
                temp2[z][ww]='a';
                }
            }
        }
        //出力例と同じになるように整頓し、出力する。
        
        for(int q=0;q<h;q++){
            boolean sakujo = true;
            for(int a=0;a<w;a++){
                if(temp2[q][a]=='.' || temp2[q][a]=='#'){
                    sakujo=false;
                }
                if(temp2[q][a]!='a'){
                    System.out.print(temp2[q][a]);
                }
            }
            
            if(sakujo){
                continue;
            }
            System.out.println();
        }
    }
}