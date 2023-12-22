public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int[] a;
    int[] count;
    int i;

    count = new int[3];
    a = new int[5];

    for(;;){
      for(i = 0;i < 3;i++)count[i] = 0;
      a[0] = sc.nextInt();
      if(a[0] == 0)break;
      count[a[0] - 1]++;
      for(i = 1;i < 5;i++){
        a[i] = sc.nextInt(); count[a[i] - 1]++;
      }

      if(count[0] * count[1] * count[2] != 0){
        out.printf("3%n3%n3%n3%n3%n");
      }else if(count[0] == 5){
        out.printf("3%n3%n3%n3%n3%n");
      }else if(count[1] == 5){
        out.printf("3%n3%n3%n3%n3%n");
      }else if(count[2] == 5){
        out.printf("3%n3%n3%n3%n3%n");
      }else if(count[0] == 0){
        for(i = 0;i < 5;i++){
          if(a[i] == 2)out.println("1");
          else out.println("2");
        }
      }else if(count[1] == 0){
        for(i = 0;i < 5;i++){
          if(a[i] == 2)out.println("1");
          else out.println("2");
        }
      }else if(count[2] == 0){
        for(i = 0;i < 5;i++){
          if(a[i] == 1)out.println("1");
          else out.println("2");
        }
      }
    }



    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}