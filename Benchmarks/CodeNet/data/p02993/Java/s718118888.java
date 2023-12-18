import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    String result = Good;
    String[] split = s.split("",0);
    for(int i = 0;i < 4;i++){
      for(int j = 0;j < 4;j++){
        if(split[i].equals(split[j])){
          result = "Bad";
        }
      }
    }
      System.out.println(result);
  }
}