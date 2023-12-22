import java.util.Scanner;
 
public class Main {
	static int[]z;
    public static int a,b,n,w,t;
	private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        w=sc.nextInt();
        n=sc.nextInt();
        z = new int[w];
        mmm();
        for(int i=0;i<w;i++)
            System.out.println(z[i]);
            }
    static void mmm(){
    	   for(int i=0;i<w;i++){
               z[i] = i+ 1;
           }
    	for(int i= 0; i< n; i++) {
            String mm= sc.next();
            String[] a1 = mm.split(",");
            a = Integer.parseInt(a1[0]) -1;
            b = Integer.parseInt(a1[1]) -1;
            t=z[a];
            z[a]=z[b];
            z[b]=t;
        }
    	
    	
    }
    }