import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int[] k =new int [] {a,b,c};

    if (k[0]>k[1]){
      int t = k[0];
      k[0]=k[1];
      k[1]=t;
    }
      if(k[1]>k[2]){
        int p = k[1];
        k[1]=k[2];
        k[2]=p;
      }
        if(k[0]>k[1]){
          int v = k[0];
          k[0]=k[1];
          k[1]=v;
        }


    System.out.println(k[0]+" "+k[1]+" "+k[2]);
  }
}
