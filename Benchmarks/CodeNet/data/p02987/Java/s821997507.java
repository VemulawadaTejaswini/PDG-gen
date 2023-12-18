import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = 0;
    String x = sc.nextLine();
    String[] split = x.split("");
    for(int i = 0;i<4;i++){
      for(int j = 0;j<4;j++){
        if(split[i].equals(split[j])){
          count++;
        }
      }
    }
    if(count == 4){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}