import java.util.Scanner;

class Main{
  static long q = 0;
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      caseis(sc.nextLong(),sc.nextLong());
      System.out.print(q);
    }
    static void caseis(long i , long j){
      if(i == 1 || j == 1){
        q = 1;
      }else if(i >= j){
        calces(i , j);
      }else{
        calces(j , i);
      }
    }
    static void calces(long i , long j){
      q = i * ( j / 2 );
      if(j % 2 != 0){
        q += (i - i / 2);
        }
    }

}