import java.util.*;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String S = sc.next();
      char[] a = new char[N];
      int[] b = new int[N];
      int[] c = new int[N];
      int count = 0;
      int m = N;
      for(int i=0;i<N;i++){
      	a[i]=S.charAt(i);
        if(a[i]=='W'){
        	b[i]=-1;
        }
        if(a[i]=='E'){
        	b[i]=1;
        }
      }
      for(int j=0;j<N;j++){
      	for(int k=0;k<j;k++){
        	c[k]=b[k]*(-1);
            if(c[k]==1){
        		count++;
        	}
        }
        for(int l=j+1;l<N;l++){
        	c[l]=b[l];
            if(c[l]==1){
        		count++;
        	}
        }
        m = Math.min(m,count);
        count=0;
      }
      System.out.println(m);
    }
}