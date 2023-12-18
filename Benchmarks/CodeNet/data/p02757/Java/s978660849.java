import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n= scn.nextInt();
		int p = scn.nextInt();
		String s =scn.next();
		System.out.println(res(s,p));
				

	}
	public static long res(String s ,int p){
	   long ans =0;
	   
	   long []arr = new long[s.length()];
	   for(int i=s.length()-1;i>=0;i--){
		   char ch =s.charAt(i);
		   int val =ch-'0';
		  // System.out.println(val);
		   if(val%p==0){
			 arr[i]+=1;
			 arr[i]+=i+1<arr.length?arr[i+1]:0;
		   }else{
			    if(i+i<arr.length){
			    	if((int)(s.charAt(i+1)-'0')%p!=0){
			    	val=val*10+ (s.charAt(i+1)-'0');
			    	if(val%p==0){
			    		arr[i]+=1;
			    		arr[i]+=i+2<arr.length?arr[i+2]:0;
			    	}
			    	}
			    }
			   
		   }
	   }
	   for(int i=0;i<arr.length;i++){
		   ans+=arr[i];
	   }
	   
	   return ans;
	}

}