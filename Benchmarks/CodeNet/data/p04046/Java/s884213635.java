import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    long[] bef_field = new long[w];

    for (int i = 0; i < h ; i++){
      long[] field = new long[w];
      for (int j = 0; j < w ; j++){
        if(i >= h - a && j < b){
          field[j] = 0;
        } else {
          field[j] = 1;
        }
        if (field[j] == 0) {
          continue;
        }
        if (i == 0) {
          field[j] = 1;
          continue;
        }
        field[j] = (bef_field[j] + (j == 0 ? 0 : field[j-1]) ) % ((int)Math.pow(10, 9) + 7);
      }
      if (i == h-1 ){
        System.out.println(field[w-1]);
      }
      bef_field = field;
    }
    sc.close();
  }
}