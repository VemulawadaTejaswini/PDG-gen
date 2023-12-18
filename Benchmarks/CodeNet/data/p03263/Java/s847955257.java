import java.util.Arrays;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int a[][] = new int[h][w];
        int sum = 0;


        for(int i=0;i<h;i++) {
        	for(int j=0;j<w;j++) {
        		a[i][j] = sc.nextInt();
        		sum = a[i][j];
        	}
        }
        int z = h*w;
        String t[] = new String[z];
        Arrays.fill(t, "");

        int r = 0;
        int k=0;

        for(int i = 0;i<h;i++) {
        	if(i%2 == 0) {
        		for(int j=0;j<w-1;j++) {
        			if((a[i][j] + r)%2 == 1) {
        				t[k] = ((i+1) + " " + (j+1) + " " + (i+1) + " " + (j+2));
        				r = 1;
        				k= k+1;
        			}else {
        				r = 0;
        			}
        		}
        		if(i != h-1 && (a[i][w-1]+r)%2 == 1) {
        			t[k] = ((i+1) + " " + w + " " + (i+2) + " " + w);
        			r = 1;
    				k= k+1;
        		}else {
        			r = 0;
        		}
        	}else {

        		for(int j=w-1;j>0;j--) {
        			if((a[i][j] + r)%2 == 1) {
        				t[k] = ((i+1) + " " + (j+1) + " " + (i+1) + " " + j);
        				r = 1;
        				k= k+1;
        			}else {
        				r = 0;
        			}
        		}
        		if(i != h-1 && (a[i][0]+r)%2 == 1) {
        			t[k] = ((i+1) + " " + 1 + " " + (i+2) + " " + 1);
        			r = 1;
    				k= k+1;
        		}else {
        			r = 0;
        		}
        	}
        }
    	System.out.println(k);
    	for(int i=0;i<k;i++) {
    		System.out.println(t[i]);
    	}

    }

}