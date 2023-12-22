import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X=sc.nextLong();
    long A=1;
    long B=-5;
    Double value=0.0;
    if(X==0.0||X==1){
      if(X==0.0){
        System.out.println(0+" "+0);
        return;
      }
      if(X==1.0){
        System.out.println(1+" "+0);
        return;
      }
    }
    for(int i=1;i<=X;i++){
     for (int j=-5;j<=X;j++) {
       System.out.println(A+" "+B);
       if(X+Math.pow(j,5)>0.0){
       if((Math.log(X+ Math.pow(j, 5))/Math.log(i))==5.0){
         A=i;
         B=j;
          break;

       }
     }
     }


    }
       System.out.println(A+" "+B);



  }
}
