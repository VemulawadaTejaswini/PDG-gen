import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine());
    int R = 0;
    int B = 0;
    String s = sc.nextLine();
    
    for (int i = 0; i < N;i++){
        if("R".equals(s.substring(i,i+1))){
            R++;
        } else {
            B++;
        }
    }

    if(R>B){
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
  }

}
