import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.next());
        int[] ns = new int[n];
        for(int i=0;i<n;i++) {
        	ns[i] = Integer.valueOf(scan.next());
        }
        boolean fg = true;
        int change = 0;
        int cnt=0;
        while(fg) {
        	fg = false;
        	for(int i=n-1;i>0;i--) {
        		if(ns[i] < ns[i-1]) {
        			change =  ns[i];
        			ns[i] = ns[i-1];
        			ns[i-1] = change;
        			cnt++;
        			fg=true;
        		}
        	}
        }
        for(int i=0;i<n-1;i++) {
        	System.out.print(ns[i]+" ");
        }
        System.out.println(ns[n-1]);
        System.out.println(cnt);
        scan.close();
    }
}
