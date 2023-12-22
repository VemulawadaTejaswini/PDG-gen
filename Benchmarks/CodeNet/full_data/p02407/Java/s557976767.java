import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new TEST().doIt();
    }
    class TEST{
        void doIt(){
        	int n = sc.nextInt();
        	int a[] = new int [n];
        	for(int i = 0;i < n;i++)a[i] = sc.nextInt();
        	for(int i = n-1;i > 0;i--)System.out.print(a[i]+" ");
        	System.out.println(a[0]);
        }
    }
}