import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args){
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]p=new int[n];
        for(int i=0;i<n;i++)p[i]=sc.nextInt()-1;
        int max=(n%2==0)?n/2:n/2+1;
        int count=0;
        for(int i=0;i<n-1;i++) {
        	if(p[i]==i && p[i+1]!=i) {
        		int temp=p[i];
        		p[i]=p[i+1];
        		p[i+1]=temp;
        		
        		count++;
        	}
        }
        System.out.println(count);
        
    }
}