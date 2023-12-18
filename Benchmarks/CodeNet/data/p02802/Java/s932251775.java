import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
     	int n,m,k,ac,wc;
      	String str;
      	n=sc.nextInt(); m=sc.nextInt();
      	boolean flg[] = new boolean[n];
      	ac=0;wc=0;
      	for(int i=0;i<m;i++){
        	k=sc.nextInt();
          	str = sc.nextLine();
          	if(!flg[k-1]){
            	if(str.equals("AC")){
                	ac++;
                  	flg[k-1]=true;
                }else{
                	wc++;
                }
            }
        }
      	System.out.println(ac+" "+wc);
    }
}