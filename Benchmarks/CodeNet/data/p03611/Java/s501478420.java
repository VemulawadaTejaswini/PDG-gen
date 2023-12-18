import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),max=0;
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    for(int i=0;i<n-1;i++){
      int f=0;
      for(int j=0;j<n;j++){
        if(Math.abs(a[j]-a[i])<=2){
          f++;
        }else{break;}
      }
      max=(int)Math.max(max,f);
    }
    System.out.println(max);
          
  }
}