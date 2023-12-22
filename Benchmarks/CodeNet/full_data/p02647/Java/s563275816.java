import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	int[] list = new int[n];
      	for(int cnt = 0;cnt < list.length;cnt++){
        	list[cnt] = sc.nextInt();
        }
      	for(int cnt = 0;cnt < k;cnt++){
        	swap(list);
        }
      	for(int num : list){
        	System.out.print(num + " ");
        }
    }
  	public static void swap(int[] list){
    	int save = 0;
      	int count = 1;
      	int cnt = 1;
      	for(int i = 0;i < list.length;i++){
        	for(int j = 0;j < list.length;j++){
            	if(count > (double)(cnt - list[j] - 0.5) && count < (double)(cnt + list[j] + 0.5)){
                	save++;
                }
              	cnt++;
            }
          	list[i] = save:
          	count++;
          	save = 0;
        }
    }
}