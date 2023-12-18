import java.util.*

public class Main {
  public static void main(){
    Scanner scanner = new Scanner(System.in);
    int main_1 = scanner.nextInt();
    String[] main_2 = new String[(main_1- 1)];
    for(int main_3 = 0;main_3 <= main_1;main_3++){
      String main_4 = main_2[main_3];
      String main_5 = main_2[main_3 - 1];
      if(
        main_3 != 0&&
        !main_5.substring(main_5.length() - 1).equalIgnoreCase(main_4.substring(0, 1))
      ){
        System.out.println("No");
        System.exit(0);
      }
    }
    System.out.println("Yes");
  }
}