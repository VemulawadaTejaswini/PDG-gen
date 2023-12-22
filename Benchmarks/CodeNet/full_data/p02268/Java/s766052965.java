import java.util.*;
class Main{
	static int BinarySearch(int[] data, int key){
		int result = -1;
		int r = data.length-1;
		int l = 0;
		while(result == -1 && l <= r){
			int middle = (l+r)/2;
			if(data[middle]<key){
			    l = middle + 1;
			}else if(data[middle] > key){
				r = middle - 1;
			}else{
				result = middle ;
			}
		}
		if (result>=0){
			return 1;
		}else{
			return 0;
		}
 
	}
	public static void main(String[] args){
		int count = 0;
		Scanner x=new Scanner(System.in);
	    int s1 = x.nextInt();
		int[] r1=new int[s1+1];
		for(int i=0;i<s1;i++){
		    r1[i]=x.nextInt();
		}
	    int s2 = x.nextInt();
		int[] r2=new int[s2];
		for(int j=0;j<s2;j++){
		    r2[j]=x.nextInt();
		}
		x.close();
		if(s1<s2){
		for(int i=0;i<s1;i++){
			if(BinarySearch(r1,r2[i])==1){
				count++;
			}
		}
		}else if(s1>s2){
			for(int j=0;j<s2;j++){
			    if(BinarySearch(r1,r2[j])==1){
				    count++;	
		       }
			}
		}
		System.out.println(count);
	}
}
