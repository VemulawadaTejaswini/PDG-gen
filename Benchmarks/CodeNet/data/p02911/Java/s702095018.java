import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int po = sc.nextInt();
      	int q = sc.nextInt();
      	int point[] = new int[n];
      	boolean flg[] = new boolean[n];
      	for(int i=0;i<n;i++){
        	point[i] = po;
          	flg[i] = true;
        }
      	for(int i=0;i<q;i++){
        	int k = sc.nextInt();
          	for(int j=0;j<n;j++){
            	if(j+1==k){continue;}
              	point[j]--;
              	if(point[j]<=0){
                	flg[j] = false;
                }
            }
        }
      	for(int i=0;i<n;i++){
        	if(flg[i]){
            	System.out.println("Yes");
            }else{
            	System.out.println("No");
            }
        }
    }
}