import java.util.*;
public class Main {
	static int[] list;
    public static void main(String[] args){
    	Scanner sc =new Scanner(System.in);
    	int n= sc.nextInt();//0<=n<=44
    	list=new int[n+1];
    	Arrays.fill(list,0);
    	System.out.println(calcfib(list,n));
    }
    static int calcfib(int[] list,int i){
    	if(i==1||i==0){
    		return 1;
    	}else if(list[i]==0){
    		return list[i]=calcfib(list,i-1)+calcfib(list,i-2); 
    	}else{
    		return list[i];
    	}
    	
    }
}
