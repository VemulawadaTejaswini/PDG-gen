public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, m;
    int[] a, b;
    int i, j, maxdef, human, count;

    n = sc.nextInt();
    m = sc.nextInt();
    a = new int[m];
    b = new int[m];

    for(i = 0;i < m;i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    count = 0;
    human = -1;

    for(i = 0;i < n;){
      maxdef = 0;
      human = -1;
      for(j = 0;j < m;j++){
        if(a[j] <= (i + 1) && (i + 1) <= b[j] && maxdef < b[j]){
          maxdef = b[j];
          human = j;
        }
      }

      if(human == -1){
        break;
      }else{
        i = b[human];
        count++;
      }
    }

    if(human == -1){
      System.out.println("Impossible");
    }else{
      System.out.println(count);
    }


/*end*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}