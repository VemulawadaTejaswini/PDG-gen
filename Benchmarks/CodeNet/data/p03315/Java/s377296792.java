import java.util.Scanner;

class EatingSymbols {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    int num = 0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i) == '+'){
        num++;
      }
      else{
        num--;
      }
    }
    System.out.println(num);
  }
}
