import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int q = scan.nextInt();
        HashMap<Integer, Integer> ls = new HashMap<>();	
      	for(int i = 0; i < n; i ++){
          	int pare = scan.nextInt();
          	int chir = scan.nextInt();
          	ls.add(chir, pare);
            }
      	int[] c = new int[n];
      	for(int i = 0; i < q; i ++){
        	int p = scan.nextInt();
          	int x = scan.nextInt();
          	c[p] +=  x;
        }
      	System.out.print(c[0] + " ");
      	for(int j = 1; j < n; j ++){
        	System.out.print(c[j] + ls.get(j) + " ");
        }
        }
    }
}	