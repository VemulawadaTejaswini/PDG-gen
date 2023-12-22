import java.util.*;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tmp=0,min=0,max=0,sum=0;

    for(int i=0;i<n;i++){
      if(i==0){
        tmp = sc.nextInt();
        min = tmp;
        max = tmp;
        sum = tmp;
      }else{
        tmp = sc.nextInt();
        if(tmp<min) min = tmp;
        if(tmp>max) max = tmp;
        sum += tmp;
      }
    }
    System.out.println(min+" "+max+" "+sum);
  }
}
