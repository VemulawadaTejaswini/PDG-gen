import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans =n;
    int[] array = new int[n];
    for(int i=0; i<n; i++){
      array[i] = sc.nextInt();//1以上N以下
    }

    for(int i=0; i<(2<<n);i++){
     boolean flag = true;
     int[] bi = new int[n];
       for(int j=0; j<n; j++){
         if((1&i>>j)==1){
          bi[j] = 1;
         }
       }
      int num =0;
      for(int k=0; k<n;k++){
        if(bi[k]==1){
          if(array[k] == num+1){
            num +=1;
          }else{
            flag = false;
          }
        }
      }

      if(flag=true){
        ans = Math.min(ans,n-num);
      }


    }

    if(ans==n){
      System.out.println("-1");
    }else{
      System.out.println(ans);
    }


  }
}