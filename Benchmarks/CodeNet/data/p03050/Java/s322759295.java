import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	ArrayList<Integer> arr = new ArrayList<>(); 
      	for(int i = 1; i < n + 1; i ++){
        	if(n%i == n/i){
            	arr.add(i);
            }
        }
      	int ans = 0;
      	for(int j = 0; j < arr.size(); j++){
        	ans = ans + arr.get(j);
        }
     	System.out.print(ans);
    }

}