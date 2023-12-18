import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  static int get_maxindex(int[] array){
    int max =0;
    int max_i=0;
    int i=0;
    for(int a : array){
      if(a>max){
        max = a;
        max_i = i;
      }
      i+=1;
    }
    return max_i;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] flowers = new int[n];
    for(int i=0; i<n; i++){
      flowers[i] = sc.nextInt();
    }
    int max_index = get_maxindex(flowers);
    int count =0;
    while(flowers[max_index]!=0){
    int j=0;
     while(j<n){
      if(flowers[j]==0){j++;}
      else{
        count+=1;
        while(j<n&&flowers[j]!=0){
          flowers[j] = flowers[j] -1;
          j+=1;
        }
      }
     }
    }
    System.out.println(count);


  }
}