import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),ans=0;
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    for(int i=0;i<n;i++){
      if(i==0){
        if(a[0]<a[1]){
          ans++;
        }
      }else{
        int f=0;
        if(a[i]==a[i-1]){
          f++;
        }else{
          for(int j=0;j<i;j++){
            
            if(a[i]%a[j]==0){
              f++;
              break;
            }
          }
        }
        if(f==0){
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}
