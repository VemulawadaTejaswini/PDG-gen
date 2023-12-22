import java.util.*;

public class Main{
  public static final int HEIGHT = 12;
  public static final int WIDTH = 6;
  public static final int dx[] = {1, -1, 0, 0};
  public static final int dy[] = {0, 0, 1, -1};

  /**
   * テ、ツクツ偲」ツ?暗」ツつ嘉」ツつ古」ツ?淌・ツコツァテヲツィツ凖」ツ?古」ツδ陛」ツつ」テ」ツδシテ」ツδォテ」ツδ嘉」ツ?ョテァツッツ?・ツ崢イテ・ツ??」ツ?ォテ・ツ渉偲」ツ?セテ」ツ?」テ」ツ?ヲテ」ツ??」ツつ凝」ツ?凝・ツ按、テ・ツョツ堙」ツ?凖」ツつ凝」ツ??
   * @param x テヲツィツェティツサツク(0-index)
   * @param y テァツクツヲティツサツク(0-index)
   * @return (x,y)テ」ツ?古ァツッツ?・ツ崢イテ・ツ??」ツ?ォテ・ツ渉偲」ツ?セテ」ツ?」テ」ツ?ヲテ」ツ??」ツつ古」ツ?ーtrue
   */
  public static boolean withinRange(int x, int y){
    return 0 <= x && x < WIDTH && 0 <= y && y < HEIGHT;
  }

  /**
   * field[y][x]テ」ツ?凝」ツつ嘉ァツケツ凝」ツ?古」ツつ凝・ツ青古」ツ?佚ァツィツョテゥツ。ツ榲」ツ?ョテ」ツ?キテ」ツつ暗」ツつ津ヲツカツ暗」ツ?凖」ツ?づ」ツ?陛」ツつ嘉」ツ?ォテゥツ堋」テヲツ篠・テ」ツ?凖」ツつ凝」ツ?甘ゥツつェテゥツュツ氾」ツ?キテ」ツつ暗」ツ?古」ツ?づ」ツつ古」ツ?ーテ・ツ可甘ゥツ卍、テ」ツ?凖」ツつ凝」ツ??
   * @param field テ」ツ?キテ」ツつ暗」ツ?キテ」ツつ暗」ツ?ョテ」ツδ陛」ツつ」テ」ツδシテ」ツδォテ」ツδ?
   * @param x テヲツィツェティツサツク(0-index)
   * @param y テァツクツヲティツサツク(0-index)
   * @param kind field[y][x]テ」ツ?ョテ」ツ?キテ」ツつ暗」ツ?キテ」ツつ暗」ツ?ョテァツィツョテゥツ。ツ?
   */
  public static void deleteConnectedPuyo(char[][] field, int x, int y, char kind){
    field[y][x] = '.';

    for(int i = 0; i < 4; i++){
      int nx = x + dx[i];
      int ny = y + dy[i];

      if(!withinRange(nx, ny)) continue;
      if(field[ny][nx] == 'O'){
        field[ny][nx] = '.';
      }
      else if(field[ny][nx] == kind){
        deleteConnectedPuyo(field, nx, ny, kind);
      }
    }
  }

  /**
   * field[y][x]テ」ツ?凝」ツつ嘉ァツケツ凝」ツ?古」ツつ凝・ツ青古」ツ?佚ァツィツョテゥツ。ツ榲」ツ?ョテ」ツ?キテ」ツつ暗」ツ?ョテヲツ閉ーテ」ツつ津ヲツ閉ーテ」ツ?暗」ツつ?
   * @param field テ」ツ?キテ」ツつ暗」ツ?キテ」ツつ暗」ツ?ョテ」ツδ陛」ツつ」テ」ツδシテ」ツδォテ」ツδ?
   * @param x テヲツィツェティツサツク(0-index)
   * @param y テァツクツヲティツサツク(0-index)
   * @param kind field[y][x]テ」ツ?ョテ」ツ?キテ」ツつ暗」ツ?キテ」ツつ暗」ツ?ョテァツィツョテゥツ。ツ?
   * @return field[y][x]テ」ツ?凝」ツつ嘉ァツケツ凝」ツ?古」ツつ凝・ツ青古」ツ?佚ァツィツョテゥツ。ツ榲」ツ?ョテ」ツ?キテ」ツつ暗」ツ?ョテヲツ閉ー
   */
  public static int countConnectedPuyo(char[][] field, int x, int y, char kind){
    field[y][x] = '.';

    int connectedPuyo = 1;

    for(int i = 0; i < 4; i++){
      int nx = x + dx[i];
      int ny = y + dy[i];

      if(!withinRange(nx, ny)) continue;
      if(field[ny][nx] != kind) continue;

      connectedPuyo += countConnectedPuyo(field, nx, ny, kind);
    }

    field[y][x] = kind;

    return connectedPuyo;
  }

  /**
   * テ・ツ?ィテ」ツ?ヲテ」ツ?ョテ」ツ?キテ」ツつ暗」ツつ津・ツ崢コテ・ツョツ堙」ツ?ァテ」ツ?催」ツつ凝、ツスツ催ァツスツョテ」ツ?セテ」ツ?ァティツ青ステ」ツ?ィテ」ツ?凖」ツ??
   * @param field テ」ツ?キテ」ツつ暗」ツ?キテ」ツつ暗」ツ?ョテ」ツδ陛」ツつ」テ」ツδシテ」ツδォテ」ツδ?
   */
  public static void dropPuyo(char[][] field){
    for(int i = HEIGHT - 1; i > 0; i--){
      for(int j = 0; j < WIDTH; j++){
        if(field[i][j] != '.') continue;

        for(int ni = i - 1; ni >= 0; ni--){
          if(field[ni][j] != '.'){
            field[i][j] = field[ni][j];
            field[ni][j] = '.';
            break;
          }
        }
      }
    }
  }

  /**
   * テ、ツクツ偲」ツ?暗」ツつ嘉」ツつ古」ツ?淌」ツ?キテ」ツつ暗」ツ?キテ」ツつ暗」ツ?ョテ」ツδ陛」ツつ」テ」ツδシテ」ツδォテ」ツδ嘉」ツ?ョテゥツ?」テゥツ篠姪ヲツ閉ーテ」ツつ津ヲツアツづ」ツつ?」ツつ?
   * @param field テ」ツ?キテ」ツつ暗」ツ?キテ」ツつ暗」ツ?ョテ」ツδ陛」ツつ」テ」ツδシテ」ツδォテ」ツδ?
   * @return テ」ツ?キテ」ツつ暗」ツ?キテ」ツつ暗」ツ?ョテゥツ?」テゥツ篠姪ヲツ閉ー
   */
  public static int getChain(char[][] field){
    int chain = 0;

    while(true){
      boolean deleteFlg = false;

      for(int i = 0; i < HEIGHT; i++){
        for(int j = 0; j < WIDTH; j++){
          if(field[i][j] == '.') continue;
          if(field[i][j] == 'O') continue;
          if(countConnectedPuyo(field, j, i, field[i][j]) < 4) continue;

          deleteConnectedPuyo(field, j, i, field[i][j]);
          deleteFlg = true;
        }
      }

      if(!deleteFlg){
        break;
      }
      
      dropPuyo(field);
      chain++;
    }

    return chain;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    while(T-- > 0){
      char[][] field = new char[HEIGHT][WIDTH];

      for(int i = 0; i < HEIGHT; i++){
        field[i] = sc.next().toCharArray();
      }

      System.out.println(getChain(field));
    }
  }
}