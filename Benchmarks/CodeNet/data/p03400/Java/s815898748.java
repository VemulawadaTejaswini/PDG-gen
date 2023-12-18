import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 参加人数
    int participant = sc.nextInt();
    // 日数と余り
    int date = sc.nextInt();
    int add = sc.nextInt();
    // 食べた数
    int sum = add;
    for(int i = 0; i < participant ; i++){
      int num = sc.nextInt();
      int eat = 0;
      for(int j =0; j < date ; j++){
        if(j * num <= date){
          eat++;
        }else{
          break;
        }
      }
      System.out.println(eat);
      sum = sum + eat;
    }
    System.out.println(sum);
  }
}