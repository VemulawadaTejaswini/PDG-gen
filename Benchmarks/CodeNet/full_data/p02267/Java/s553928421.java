import java.util.*;

public class Main{
	static int search(int[] l,int n,int key){
		for(int i = 0; i < n; i++){
		    if(l[i] == key){
					return i;
				}
		}
		return -1 ;
	}

	public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);

	    int n = scanner.nextInt();
	    int[] l = new int[n+1];
	    for(int i = 0; i < n; i++){
				l[i] = scanner.nextInt();
			}

	    int q = scanner.nextInt();
	    int sum = 0;

	    for(int i = 0; i < q; i++){
	        if(search(l,n+1,scanner.nextInt())>=0){
						sum++;
	    	}
			}

	    System.out.println(sum);
	}
}

