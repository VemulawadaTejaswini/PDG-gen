public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int[][] f;
    int i, j, k, x, y, z, t, w, max;
    String str;
    char[] ch;

    f = new int[10][10];

    for(;sc.hasNext();){
      str = sc.next();
      ch = new char[str.length()];
      for(j = 0;j < str.length();j++)ch[j] = str.charAt(j);
      x = 0; y = 0; z = 0; k = 0;

      for(j = 0;j < str.length();j++){
        if(ch[j] == ','){
          x = readint(ch, 0, j);
          k = ++j; break;
        }
      }
      for(;j < str.length();j++){
        if(ch[j] == ','){
          y = readint(ch, k, j);
          j++; break;
        }
      }
      z = readint(ch, j, str.length());

      if(z == 1){
        f[x][y]++;
        if(x != 0)f[x - 1][y]++;
        if(y != 0)f[x][y - 1]++;
        if(x != 9)f[x + 1][y]++;
        if(y != 9)f[x][y + 1]++;
      }else if(z == 2){
        f[x][y]++;
        if(x != 0)f[x - 1][y]++;
        if(y != 0)f[x][y - 1]++;
        if(x != 9)f[x + 1][y]++;
        if(y != 9)f[x][y + 1]++;
        if(x != 0 && y != 0)f[x - 1][y - 1]++;
        if(x != 0 && y != 9)f[x - 1][y + 1]++;
        if(x != 9 && y != 0)f[x + 1][y - 1]++;
        if(x != 9 && y != 9)f[x + 1][y + 1]++;
      }else{
        f[x][y]++;
        if(x != 0)f[x - 1][y]++;
        if(y != 0)f[x][y - 1]++;
        if(x != 9)f[x + 1][y]++;
        if(y != 9)f[x][y + 1]++;
        if(x != 0 && y != 0)f[x - 1][y - 1]++;
        if(x != 0 && y != 9)f[x - 1][y + 1]++;
        if(x != 9 && y != 0)f[x + 1][y - 1]++;
        if(x != 9 && y != 9)f[x + 1][y + 1]++;
        if(x > 1)f[x - 2][y]++;
        if(y > 1)f[x][y - 2]++;
        if(x < 8)f[x + 2][y]++;
        if(y < 8)f[x][y + 2]++;
      }
    }

    w = 0; max = 0;
    for(i = 0;i < 10;i++)for(j = 0;j < 10;j++){
      if(f[i][j] == 0)w++;
      if(max < f[i][j])max = f[i][j];
    }

    out.println(w);
    out.println(max);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static int readint(char[] ch, int l, int r){
    int i, d, res;
    d = 1; res = 0;
    for(i = r - 1;i >= l;i--){
      res += d * (int)(ch[i] - '0');
      d *= 10;
    }
    return res;
  }
}