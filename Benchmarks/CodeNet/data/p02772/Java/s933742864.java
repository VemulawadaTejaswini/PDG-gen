import java.util.Scanner;
class Main{
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  boolean isCheck = true;
  for(int i = 0; i<N; i++){
    int tmp = sc.nextInt();
    if(tmp%2 == 0){
      if(tmp%3 != 0 || tmp%5 != 0){
        isCheck = false;
      }
    }
  }
  if(isCheck){
    System.out.println("APPROVED");
  }else{
    System.out.println("DENIED");
  }
}
