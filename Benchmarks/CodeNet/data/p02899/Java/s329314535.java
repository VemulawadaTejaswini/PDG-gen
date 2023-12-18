import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            int h = sc.nextInt();
            a[h-1] = i; 
        }
        for(int i = 0; i < n-1;i++){
            System.out.print((a[i]+1)+" ");
        }
        System.out.println(a[n-1]+1);
    }
}