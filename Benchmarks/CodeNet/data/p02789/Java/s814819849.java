import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
 
//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] a = new int[n];
    	for(int i = 0; i < n; i++){
    	    a[i] = sc.nextInt();
    	}
    	sc.close();
    	int cnt = 1;
    	int t = a[0];
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j <= i; j++){
        	    if(t > a[j]){
        	    	cnt++;
        	    	t = a[j];
        	    }
    		}
    	}
    	System.out.println(cnt);
    }
}