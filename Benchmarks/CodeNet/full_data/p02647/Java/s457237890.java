import java.util.*;
public class Main {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int[] a=new int[n];
      int[] l=new int[n];
      for(int i=0;i<n;i++){
      	a[i]=sc.nextInt();
        l[i]=0;
      }
      for(int K=0;K<k;K++){
      	for(int i=0;i<n;i++){
          if((i-a[i])<0){
        		for(int m=0;m<=i;m++){
            		l[m]++;
                }
            }else{
            	for(int m=(i-a[i]);m<=i;m++){
            		l[m]++;
                }
            }
        if((i+a[i]+1)>=n){
        	for(int m=i+1;m<n;m++){
            	l[m]++;
            }
        }else{
        	for(int m=i+1;m<=(i+a[i]);m++){
            	l[m]++;
            }
        }
        }
        for(int i=0;i<n;i++){
        	a[i]=l[i];
          l[i]=0;
        }
     }
     for(int i=0;i<n;i++){
     	System.out.print(a[i]+" ");
     }
	}
}