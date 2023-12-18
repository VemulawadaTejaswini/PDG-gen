import java.util.Scanner;
class Main{
  public static void main(String args[]){
    int N;
    int[] josi;
    Scanner sc = new Scanner(System.in);
    josi = new int[sc.nextInt()];
    for(int i =0;i<josi.length-1;i++){
      josi[sc.nextInt()-1]++;
    }
    for(int i = 0;i<josi.length;i++){
      System.out.println(josi[i]);
    }
  }
}