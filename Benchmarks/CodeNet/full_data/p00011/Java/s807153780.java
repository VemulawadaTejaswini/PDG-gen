import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int n=sc.nextInt();
        int x[]=new int [w];
        for(int i=0;i<w;i++){
            x[i]=i+1;
        }
        for(int i=0;i<n;i++){
            String c=sc.next();
            String []ab=c.split(",");
            int a = Integer.parseInt(ab[0]) - 1;
            int b = Integer.parseInt(ab[1]) - 1;
            int tmp=x[a];
            x[a]=x[b];
            x[b]=tmp;
        }
        for(int i=0;i<w;i++){
            System.out.println(x[i]);
        }
    }
}

