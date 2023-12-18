import java.util.*;
import java.util.Comparator;

public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);       
        int n=sc.nextInt();
        String o="Yes";
        int[] a=new int[n];
        for(int i=0;i<n;i++){
        	a[i]=sc.nextInt();
            for(int j=0;j<i;j++){
            	if(a[j]==a[i]){
                	o="No";
                    System.out.println(o);
                    return;
                }
            }
        }
      System.out.println(o);
    }
}