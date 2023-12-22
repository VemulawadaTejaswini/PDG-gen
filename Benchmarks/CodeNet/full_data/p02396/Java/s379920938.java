import java.utill.Scanner;
class Try{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int get,num = 1;
    get=sc.nextInt();
    while (get != 0){
      get=sc.nextInt();
      SYstem.out.println("Case "+num+": "+get);
      num++;
    }
  }
}

