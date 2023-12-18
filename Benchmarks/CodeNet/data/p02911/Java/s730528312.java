import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int po = sc.nextInt();
      	int q = sc.nextInt();
      	int point[] = new int[n];
      	for(int i=0;i<n;i++){
        	point[i] = 0;
        }
      	for(int i=0;i<q;i++){
        	int k = sc.nextInt();
          	point[k-1]++;
        }
      	for(int i=0;i<n;i++){
        	if(po-q+point[i]<=0){
            	System.out.println("No");
            }else{
            	System.out.println("Yes");
            }
        }
    }
}