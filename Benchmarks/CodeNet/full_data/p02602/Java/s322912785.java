import java.util.*;
 
public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.next());
      	int k = Integer.parseInt(sc.next());
      	int[] list = new int[n];
      	int[] flag = new int[n - k];
      	for(int cnt = 0;cnt < n;cnt++){
        	list[cnt] = Integer.parseInt(sc.next());
        }
      	long first = list[0];
      	long save = list[1];
      	for(int cnt = 1;cnt < k;cnt++){
        	first += list[cnt];
        }
      	int cnt = 2;
      	int f = 2;
      	int num = n - k;
      	for(int i = 0;i < num;i++){
        	for(int j = 0;j < k;j++){
            	save += list[cnt++];
            }
          	if(first < save){
            	System.out.println("Yes");
            }else{
            	System.out.println("No");
            }
          	first = save;
          	save = list[f++];
          	cnt = f;
        }
    }
}