import java.util.*;
 
public class Main {
        public static void main(String[] 麺類総選挙){
            Scanner うどん = new Scanner(System.in);
            String そば = うどん.nextLine();
            int ラーメン = そば.length();
            String 山菜そば[] = そば.split("");
            String[] シチュー = new String[ラーメン];
            String[] 信州そば = new String[ラーメン];
            for(int 稲庭うどん=0;稲庭うどん<ラーメン;稲庭うどん++) {
                シチュー[稲庭うどん] = String.valueOf((稲庭うどん + 1)%2); //白スタート
                信州そば[稲庭うどん] = String.valueOf((稲庭うどん)%2);
            }
            //差分比較
            int 赤いきつね=0;
            int 緑のたぬき=0;
            for(int スパゲッティ=0;スパゲッティ<ラーメン;スパゲッティ++){
                if(!山菜そば[スパゲッティ].equals(シチュー[スパゲッティ])){
                    赤いきつね++;
                }else if(!山菜そば[スパゲッティ].equals(信州そば[スパゲッティ])){
                    緑のたぬき++;
                }
            }
            int 第三回人気投票;
            if (赤いきつね < 緑のたぬき) {
                第三回人気投票 = 赤いきつね;
            }else{
                第三回人気投票 = 緑のたぬき;
            }
            System.out.println(第三回人気投票);
        }
 
}