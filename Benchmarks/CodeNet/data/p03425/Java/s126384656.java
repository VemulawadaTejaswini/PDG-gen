import java.util.*;

public class Main{
    public static void main(String args[]){

	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	String[] a = new String[n];
	int[] march = new int[5];
      
      for(int k= 0;k<5;k++){
        march[k]=0;
      }
      
      for(int i=0;i<n;i++){
      	a[i]=scn.next();
        if(a[i].charAt(0)=='M'){
        march[0]++;
         }else if(a[i].charAt(0)=='A'){
        march[1]++;
        }else if(a[i].charAt(0)=='R'){
        march[2]++;
        }else if(a[i].charAt(0)=='C'){
        march[3]++;
        }else if(a[i].charAt(0)=='H'){
        march[4]++;
        } 
          }
      
              for(int l= 0;l<5;l++){
          if(march[l]==0){
          march[l]=1;
          }
              }
      
      long ans =0;
      ans = march[0]*march[1]*march[2]*march[3]*march[4];
	System.out.print(ans);  
    }
}