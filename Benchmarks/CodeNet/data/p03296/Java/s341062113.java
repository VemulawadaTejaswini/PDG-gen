import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int n=0;n<N;n++) a[n]=sc.nextInt();
        int magic=0;
        for(int i=1;i<N;i++){
        	if(a[i]==a[i-1]){
        	    magic++;
        	    a[i]=5000+i;
        	}
        }
        System.out.println(magic);
    }
}