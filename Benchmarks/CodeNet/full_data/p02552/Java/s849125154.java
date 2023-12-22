import java.util.Scanner;
class Not{
  public static void main(String args[]){
    
  Scanner sc = new Scanner(System.in);
  int x = sc.nextInt();
  if(x == 0){
    System.out.prinln(1);
  }else if(x == 1){
    System.out.println(0);
  }else{
    System.out.println("Invalid");
  }
}
}
