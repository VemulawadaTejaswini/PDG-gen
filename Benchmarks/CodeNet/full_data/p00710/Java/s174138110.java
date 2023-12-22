import java.io.*;
import java.util.Scanner;
public class Main{ 
  public static void main(String[]args){ 
    Scanner sc = new Scanner(System.in);
    while(true){
      int n = sc.nextInt();
      int r = sc.nextInt();
      if(n==0 && r==0){
        break;
      }
      int [] s = new int[100];
      int [] s2 = new int[100];
      int [] p = new int[100];
      int [] c = new int[100];
      int h,i,j,k;
      for(i=0;i<n;i++){
        s[i]=n-i;
      }
      for(j=0;j<r;j++){
        for(h=0;h<n;h++){
          s2[h]=s[h];
        }
        p[j]=sc.nextInt();
        c[j]=sc.nextInt();
        for(k=0;k<p[j]+c[j]-1;k++){
          if(k<c[j]){
            s[k]=s2[k+p[j]-1];
          }
          if(k>=c[j]){
            s[k]=s2[k-c[j]];
          }
        }
      }
      System.out.printf("%d\n",s[0]);
    }
  }
}    