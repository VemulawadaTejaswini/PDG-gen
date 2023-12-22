import java.util.ArrayList;
import java.util.Scanner;
//データセット入力
//マップの縦と横の値を入力
//マップの地形を入力
//操作回数を入力
//操作を入力
//すべてのマップと操作を入力後、全てのマップを改行おきに出力
public class Main{
 public static void main(String[] args) {

  //インスタンス生成
  Scanner sc=new Scanner(System.in);
  BT_Map btm=new BT_Map();

  //変数、配列宣言
  ArrayList<ArrayList<ArrayList<String>>> maps=new ArrayList<ArrayList<ArrayList<String>>>();
  int data_set=sc.nextInt();
  int[] H_num_memory=new int[data_set];
  int[] W_num_memory=new int[data_set];

  for(int i=0;i<data_set;i++) {
   //map 縦と横入力
   int map_H=sc.nextInt();
   H_num_memory[i]=map_H;
   int map_W=sc.nextInt();
   W_num_memory[i]=map_W;
   String[][] map=new String[map_H][map_W];
   //map作成
   for(int j1=0;j1<map_H;j1++) {
    String W_words=sc.next();
    for(int j2=0;j2<map_W;j2++) {
     map[j1][j2]=W_words.substring(j2,j2+1);
    }
   }

   //debug
   /*for(int debug_i=0;debug_i<map_H;debug_i++){
	   for(int debug_j=0;debug_j<map_W;debug_j++){
		   System.out.print(map[debug_i][debug_j]);
	   }
	   System.out.println();
   }
   System.out.println();*/

   //操作回数を入力
   int com_nums=sc.nextInt();
   //操作入力
   String commands=sc.next();
   for(int j=0;j<com_nums;j++) {
    //commandsから1文字抜き出す
    String com=commands.substring(j,j+1);
    //打ち込まれた文字によって操作を行い、マップを変化させる
    //変化後のmapを返すメソッド
    if(com.equals("U")) {
     map=BT_Map.com_U(map,map_H,map_W);
    }else if(com.equals("D")) {
     map=BT_Map.com_D(map,map_H,map_W);
    }else if(com.equals("L")) {
     map=BT_Map.com_L(map,map_H,map_W);
    }else if(com.equals("R")) {
     map=BT_Map.com_R(map,map_H,map_W);
    }else if(com.equals("S")) {
     map=BT_Map.com_S(map,map_H,map_W);
    }
   }

   //debug
   /*for(int debug_i=0;debug_i<map_H;debug_i++){
	   for(int debug_j=0;debug_j<map_W;debug_j++){
		   System.out.print(map[debug_i][debug_j]);
	   }
	   System.out.println();
   }
   System.out.println();*/

   //mapをArrayList化し、mapsに加える
   ArrayList<ArrayList<String>> Hight=new ArrayList<ArrayList<String>>();
   for(int j=0;j<map_H;j++) {
    ArrayList<String> Wide=new ArrayList<String>();
    for(int k=0;k<map_W;k++) {
     Wide.add(map[j][k]);
    }
    Hight.add(Wide);
   }
   maps.add(Hight);
  }
  //mapsを出力
  //System.out.println(maps.get(0).get(0).get(0));
  for(int i=0;i<data_set;i++){
	  for(int j=0;j<H_num_memory[i];j++){
		  for(int k=0;k<W_num_memory[i];k++){
			  System.out.print(maps.get(i).get(j).get(k));
		  }
		  System.out.println();
	  }
	  if(i==maps.size()-1){
	  }else{
		  System.out.println();
	  }
  }
 }

}
class BT_Map{
 //上に移動するメソッド
 public static String[][] com_U(String map[][],int H,int W){
  //自機を探す
  for(int i=0;i<H;i++) {
   for(int j=0;j<W;j++) {
    //自機を見つけたら
    if(map[i][j].equals("^") || map[i][j].equals("v") || map[i][j].equals("<") || map[i][j].equals(">")) {
     map[i][j]="^";
     if(i==0) {
     }else if(map[i-1][j].equals(".")) {
      map[i-1][j]="^";
      map[i][j]=".";
      break;
     }
    }
   }
  }
  return map;
 }
 //下に移動するメソッド
 public static String[][] com_D(String map[][],int H,int W){
  //自機を探す
  for(int i=0;i<H;i++) {
   for(int j=0;j<W;j++) {
    //自機を見つけたら
    if(map[i][j].equals("^") || map[i][j].equals("v") || map[i][j].equals("<") || map[i][j].equals(">")) {
     map[i][j]="v";
     if(i==H-1) {
     }else if(map[i+1][j].equals(".")) {
      map[i+1][j]="v";
      map[i][j]=".";
      i=H;
      break;
     }
    }
   }
  }
  return map;
 }
 //左に移動するメソッド
 public static String[][] com_L(String map[][],int H,int W){
  //自機を探す
  for(int i=0;i<H;i++) {
   for(int j=0;j<W;j++) {
    //自機を見つけたら
    if(map[i][j].equals("^") || map[i][j].equals("v") || map[i][j].equals("<") || map[i][j].equals(">")) {
     map[i][j]="<";
     if(j==0) {
     }else if(map[i][j-1].equals(".")) {
      map[i][j-1]="<";
      map[i][j]=".";
      break;
     }
    }
   }
  }
  return map;
 }
 //右に移動するメソッド
 public static String[][] com_R(String map[][],int H,int W){
  //自機を探す
  for(int i=0;i<H;i++) {
   for(int j=0;j<W;j++) {
    //自機を見つけたら
    if(map[i][j].equals("^") || map[i][j].equals("v") || map[i][j].equals("<") || map[i][j].equals(">")) {
     map[i][j]=">";
     if(j==W-1) {
     }else if(map[i][j+1].equals(".")) {
      map[i][j+1]=">";
      map[i][j]=".";
      i=H;
      break;
     }
    }
   }
  }
  return map;
 }
 //撃つメソッド
 public static String[][] com_S(String map[][],int H,int W){
  //自機を探す
  for(int i=0;i<H;i++) {
   for(int j=0;j<W;j++) {
    //自機を見つけたら自機の向きによって撃つ方向を変える
    if(map[i][j].equals("^")) {
     for(int s=0;i-s>=0;s++) {
      if(map[i-s][j].equals("*")) {
       map[i-s][j]=".";
       break;
      }else if(map[i-s][j].equals("#")) {
       break;
      }
     }
    }else if(map[i][j].equals("v")) {
     for(int s=0;i+s<H;s++) {
      if(map[i+s][j].equals("*")) {
       map[i+s][j]=".";
       break;
      }else if(map[i+s][j].equals("#")) {
       break;
      }
     }
    }else if(map[i][j].equals("<")) {
     for(int s=0;j-s>=0;s++) {
      if(map[i][j-s].equals("*")) {
       map[i][j-s]=".";
       break;
      }else if(map[i][j-s].equals("#")) {
       break;
      }
     }
    }else if(map[i][j].equals(">")) {
     for(int s=0;j+s<W;s++) {
      if(map[i][j+s].equals("*")) {
       map[i][j+s]=".";
       break;
      }else if(map[i][j+s].equals("#")) {
       break;
      }
     }
    }
   }
  }
  return map;
 }
}
