import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // get value from StandardIn
    int num = Integer.parseInt(sc.next());
    int pos[] = new int[num];
    int min = 100;
    int max = 0;
    for(int i=0; i<num; i++){
      pos[i] = Integer.parseInt(sc.next());
      if(pos[i]<min){
        min = pos[i];
      } else if(pos[i]>max){
        max = pos[i];
      }
    }
    int minEne = 10000;
    for(int i=min; i<max; i++){
      int tmpEne = 0;
      for(int j=0; j<num; j++){
        tmpEne += Math.pow(pos[j]-i, 2);
      }
      if(tmpEne<minEne){
        minEne = tmpEne;
      }
    }
    System.out.println(minEne);
  }
}
