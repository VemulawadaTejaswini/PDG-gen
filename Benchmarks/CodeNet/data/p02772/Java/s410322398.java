import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean flag1 =  false;//偶数が含まれているか
    boolean flag2 =  false;//
    int num;
    int count = 0;
    int[] array = new int[n];

    for(int i=0; i<n; i++){
      num = sc.nextInt();
      if(num%2==0){flag1=true;}
      array[i] = num;
    }



    if(flag1){
      for(int a : array){
        if(a%2==0){
          if(a%3==0||a%5==0){
            flag2 = true;
          }else{
            flag2 = false;
            break;
          }
        }
      }

    }else{
      System.out.println("DENIED");
      return;
    }

    if(flag2){System.out.println("APPROVED");}
    else{System.out.println("DENIED");}



  }
}