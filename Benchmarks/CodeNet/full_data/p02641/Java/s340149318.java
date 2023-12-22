import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();
    int N = scanner.nextInt();
    int[] p = new int[N];

    if(N==0){
      System.out.println(X);
      scanner.close();
    return;
    }

    for(int i = 0; i<N ; i++){
      p[i] = scanner.nextInt();
    }

    int[] q = new int[N];
    for(int i=0; i<N; i++){
      q[i] = p[i] - X;
    }
    int i = 0;
    int[] flag = new int[2];
    flag[0] = 1;
    flag[1] = 1;

    while(flag[0] == 1 && flag[1] == 1){
      for(int j = 0; j< N; j++){
        if(q[j] == i){
          flag[0] = 0;
        }if(q[j] == -i){  
          flag[1] = 0;
        }
      }
      if(flag[1] == 1){
        System.out.println(X - i);
        break;
      }else if(flag[0] == 1){
        System.out.println(X + i);
        break;
      }else{
        flag[0] = 1;
        flag[1] = 1;
        i++;
      }
    }

    scanner.close();
    return;
    

  }
}