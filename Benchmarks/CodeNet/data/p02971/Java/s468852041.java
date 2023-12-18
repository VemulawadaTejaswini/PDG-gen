import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] seq = new int[n];
    int f = 0;
    int index = 0;
    int s = 0;
    for(int i = 0 ; i < n; i++){
      seq[i]= sc.nextInt();
      if(seq[i] >= f){
        s = f;
        f = seq[i];
        index = i;
      }
    }
    for(int i = 0; i < n; i++){
      if(i != index)System.out.println(f);
      else{System.out.println(s);}
    }
  }
}