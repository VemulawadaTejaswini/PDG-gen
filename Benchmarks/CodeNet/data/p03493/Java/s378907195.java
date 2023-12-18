import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] strAry = sc.nextLine();
    
    int count = 0;
    if(strAry[0] == '1') count++;
    if(strAry[1] == '1') count++;
    if(strAry[2] == '1') count++;    
    System.out.println(count);
    
    return;
  }
}