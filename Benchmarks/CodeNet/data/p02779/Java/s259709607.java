import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		Integer[] array = new Integer[n];
		for(int i = 0; i < n; ++i) {
		    int tmp = Integer.parseInt(sc.next());
		    array[i] = tmp;
		}
		
		boolean flag = false;
		
		for(int i = 0; i < n; ++i) {
		    for(int j = 0; j < n; ++j) {
		        if((i != j) && Math.abs(array[i] - array[j]) != 0) {
		            flag = true;
		        }
		        else if((i != j) && Math.abs(array[i] - array[j]) == 0) {
		            flag = false;
		            break;
		        }
		        else continue;
		    }
		    if(flag) continue;
		    else {
		        System.out.println("No");
		        break;
		    }
		}
		if(flag) System.out.println("YES");
	}
}