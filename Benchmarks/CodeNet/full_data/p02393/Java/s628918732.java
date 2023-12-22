import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = (int)Integer.parseInt(sc.next());
    	int b = (int)Integer.parseInt(sc.next());
    	int c = (int)Integer.parseInt(sc.next());
    	int [] arr=new int[]{a,b,c};
    	//System.out.print(arr[0]);
    	Arrays.sort(arr);
    	for(int i=0;i<arr.length;i++){
    	}
    	System.out.print(arr[0]+" "+arr[1]+" "+arr[2]);
		}
    }
    
