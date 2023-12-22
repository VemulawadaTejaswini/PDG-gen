public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int i, j;
    char[][] ch;
    String str;

    ch = new char[8][8];
    for(;sc.hasNext();){
      for(i = 0;i < 8;i++){
        str = sc.next();
        for(j = 0;j < 8;j++)ch[i][j] = str.charAt(j);
      }
      for(i = 0;i < 8;i++)for(j = 0;++j < 8;){
        if(ch[i][j] == '1'){
          if(i < 5 && ch[i + 3][j] == '1'){
            out.println("B"); break;
          }else if(j < 5 && ch[i][j + 3] == '1'){
            out.println("C"); break;
          }else if(i < 7 && ch[i + 1][j] == '1'){
            if(j < 7 && ch[i][j + 1] == '1'){
              if(ch[i][j] == '1'){
                out.println("A"); break;
              }else if(i != 0 && ch[i - 1][j + 1] == '1'){
                out.println("D"); break;
              }else if(j != 0 && ch[i + 1][j - 1] == '1'){
                out.println("G"); break;
              }
            }else if(j < 7 && ch[i + 1][j + 1] == '1'){
              if(j != 0 && ch[i][j - 1] == '1'){
                out.println("E"); break;
              }else if(i < 6 && ch[i + 2][j + 1] == '1'){
                out.println("F"); break;
              }
            }
          }
        }
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}