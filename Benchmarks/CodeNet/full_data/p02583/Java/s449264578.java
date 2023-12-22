import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int count=0,l1,l2,l3;
    int max = scan.nextInt(),tmp;
    int[] bars = new int[max];
    for(int i=0;i<max;i++)bars[i] = scan.nextInt();
    for(int i=0;i<max-2;i++){
      for(int j=0;j<max-i-1;j++){
        if(bars[j]<bars[j+1]){
          tmp=bars[j];
          bars[j]=bars[j+1];
          bars[j+1]=tmp;
        }
      }
    }
    for(int i=0; i<max-2;i++){
      l1=bars[i];
      for(int j=i+1; j<max-1;j++){
        l2=bars[j];
        for(int k=j+1; k<max;k++){
          if(l1==l2)break;
          l3=bars[k];
          if(l1<(l2+l3) && l2<(l1+l3) && l3<(l1+l2)&& l3 != l1 && l3 != l2){
            count++;
          }
        }
      }
    }
    
    System.out.println(""+count);
  }
  
}