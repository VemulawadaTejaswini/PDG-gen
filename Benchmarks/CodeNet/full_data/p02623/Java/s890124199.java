import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    int[] arr1 = new int[n];
    int[] arr2 = new int[m];
    for(int i=0;i<n;i++){
      arr1[i]=sc.nextInt();
    }
    for(int j=0;j<m;j++){
      arr2[j]=sc.nextInt();
    }
    int i=0;
    int j=0;
    int ans=0;
    while(k>0 && i<arr1.length && j<arr2.length){
       if(arr1[i]<arr2[j]){
        k=k-arr1[i];
        i++;
       }
       else{
        k=k-arr2[j];
        j++;
       }
       ans++;
    }
    while(k>0 && i<arr1.length){
      k=k-arr1[i];
      i++;
      ans++;

    }
    while(k>0 && j<arr2.length){
      k=k-arr2[j];
      j++;
      ans++;
    }
    if(k<0){
      System.out.println(ans-1);
    }
    else{
      System.out.println(ans);
    }
  }
}