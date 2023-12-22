public class Main{
  static int topx = 0;
  static int topy = 0;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int w, h, i, j, res;
    char[][] field;
    int[][] count;
    int[] nowx, nowy;
    String str;

    for(;;){
      w = sc.nextInt(); h = sc.nextInt();
      if(w == 0 && h == 0)break;
      field = new char[h][w]; count = new int[h][w];
      nowx = new int[h * w + 1]; nowy = new int[h * w + 1];
      for(i = 0;i < h;i++)for(j = 0;j < w;j++)count[i][j] = 0;
      res = 0;

      for(i = 0;i < h;i++){
        str = sc.next();
        for(j = 0;j < w;j++){
          field[i][j] = str.charAt(j);
          if(field[i][j] == '@'){
            pushx(nowx, i); pushy(nowy, j); count[i][j]++; res++;
          }
        }
      }

      for(;;){
        if(topx == 0)break;
        i = seetopx(nowx); j = seetopy(nowy);
        if(i != 0 && field[i - 1][j] == '.' && count[i - 1][j] == 0){
          pushx(nowx, i - 1); pushy(nowy, j); count[i - 1][j]++; res++;
        }else if(j != 0 && field[i][j - 1] == '.' && count[i][j - 1] == 0){
          pushx(nowx, i); pushy(nowy, j - 1); count[i][j - 1]++; res++;
        }else if(i != h - 1 && field[i + 1][j] == '.' && count[i + 1][j] == 0){
          pushx(nowx, i + 1); pushy(nowy, j); count[i + 1][j]++; res++;
        }else if(j != w - 1 && field[i][j + 1] == '.' && count[i][j + 1] == 0){
          pushx(nowx, i); pushy(nowy, j + 1); count[i][j + 1]++; res++;
        }else{
          i = popx(nowx); j = popy(nowy);
        }
      }

      out.println(res);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int popx(int[] stack){
    return stack[--topx];
  }
  private static void pushx(int[] stack, int a){
    stack[topx++] = a; return;
  }
  private static int seetopx(int[] stack){
    return stack[topx - 1];
  }
  private static int popy(int[] stack){
    return stack[--topy];
  }
  private static void pushy(int[] stack, int a){
    stack[topy++] = a; return;
  }
  private static int seetopy(int[] stack){
    return stack[topy - 1];
  }
}