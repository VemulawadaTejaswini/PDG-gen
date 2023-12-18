import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] color = new int[9];
    Arrays.fill(color,0);
    int N = sc.nextInt();
    int num = 0;
    for(int i=0;i<N;i++){
      num = sc.nextInt();
      if(1<=num&&num<=399){
        if(color[0]==0){color[0]=1;}
      }else if(400<=num&&num<=799){
        if(color[1]==0){color[1]=1;}
      }else if(800<=num&&num<=1199){
        if(color[2]==0){color[2]=1;}
      }else if(1200<=num&&num<=1599){
        if(color[3]==0){color[3]=1;}
      }else if(1600<=num&&num<=1999){
        if(color[4]==0){color[4]=1;}
      }else if(2000<=num&&num<=2399){
        if(color[5]==0){color[5]=1;}
      }else if(2400<=num&&num<=2799){
        if(color[6]==0){color[6]=1;}
      }else if(2800<=num&&num<=3199){
        if(color[7]==0){color[7]=1;}
      }else{
        color[8]++;
      }
    }
    int min = 0;
    for(int i=0;i<8;i++){
      if(color[i]==1){
        min++;
      }
    }
    System.out.print(min+" ");
    int max = min + color[8];
    if(max==9||max==10){
      max = 8;
    }
    System.out.print(max);
  }
}