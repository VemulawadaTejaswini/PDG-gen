import java.io.*;
import java.util.*;
class Main{
 public static void main(String args[]){
   Scanner in = new Scanner(System.in);
 	int N = in.nextInt();
   	int K = in.nextInt();
   	boolean check[]=new boolean[10];
   	Arrays.fill(check,true);
   	for(int i =0;i<K;i++){
    	check[in.nextInt()] = false;
    }
   int smallest=11,smallestGreaterThanZero=11;
   if(check[0]){
   	smallest = 0;
   }
   for(int i =1;i<=9;i++){
   	if(check[i]){
    	smallestGreaterThanZero = i;
      	if(smallest!=0){
        	smallest = i;
        }
      	break;
    }
   }
   int dig[] = new int[5];
   int carry =0;
   int len = calculateLength(N);
   int temp = N;
   int i=0;
   while(temp>0){
   		dig[i] = temp%10;
     	while(!check[dig[i]]){
        	dig[i]++;
          	if(dig[i]==10){
            	dig[i] = 0;
        	}
     	}
     	i++;
     	temp/=10;
   }
   int ans=0;
   for(i = len-1;i>=0;i--){
   		ans = ans*10+dig[i];
   }
   if(ans<N){
     	ans = smallestGreaterThanZero;
     	for(i =0;i<len;i++)
        {
          ans = ans*10+smallest;
        }
   }
   System.out.println(ans);
 }
 public static int calculateLength(int N){
 	int count=0;
    while(N>0){
      N/=10;
      count++;
     }
   return count;
 }
}