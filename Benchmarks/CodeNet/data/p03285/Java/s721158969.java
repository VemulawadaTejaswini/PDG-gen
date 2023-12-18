import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();

  if(N>17||(N>8&&(N-7)%4==0)||(N>15&&(N-14)%4==0)){
    System.out.println("Yes");
  }else{
    System.out.println("No");
  }

}
}
