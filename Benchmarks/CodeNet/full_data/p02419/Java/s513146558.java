public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    String w, t;
    int count, i, wm, tm;
    char[] wch, tch;

    count = 0;
    w = sc.next();
    wm = w.length();
    wch = new char[wm];
    for(i = 0;i < wm;i++){
      wch[i] = w.charAt(i);
      if(wch[i] >= 'A' && wch[i] <= 'Z'){
        wch[i] += 'a' - 'A';
      }
    }

    for(;;){
      t = sc.next();
      if("END_OF_TEXT".equals(t)){
        break;
      }else{
        tm = t.length();
        tch = new char[tm];
        for(i = 0;i < tm;i++){
          tch[i] = t.charAt(i);
          if(tch[i] >= 'A' && tch[i] <= 'Z'){
            tch[i] += 'a' - 'A';
          }
        }

        if(wm == tm){
          for(i = 0;i < tm;i++){
            if(wch[i] != tch[i])break;
          }
          if(i == tm)count++;
        }
      }
    }

    System.out.println(count);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}