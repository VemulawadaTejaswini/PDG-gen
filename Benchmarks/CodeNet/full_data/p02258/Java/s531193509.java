import  java.util.*;
class Main{
    int n;
        
    Main(){
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	int ans=-1000000000;
	int mini;
	mini=sc.nextInt();

	for(int i=0; i<n-1; i++){
	    int num=sc.nextInt();
	    
	    ans=max(ans,num-mini);

	    mini=min(mini,num);
	}
       
	System.out.println(ans);
    }

    int max(int a,int b){
	if(a>b)return a;
	else return b;
    }

    int min(int a,int b){
	if(a<b)return a;
	else return b;
    }





    public static void main(String[] args){
	new Main();
    }
}