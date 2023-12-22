import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int n = sc.nextInt();
        int num[] = new int[w];
        int a,b,c;
        for(int i=0;i<w;i++){
            num[i]=i+1;
        }

        for(int i=0;i<n;i++){
            String str = sc.next();
            String pa[]=str.split(",");
            a=Integer.parseInt(pa[0])-1;
            b=Integer.parseInt(pa[1])-1;
            c=num[a];
            num[a]=num[b];
            num[b]=c;
        }
        for(int i=0;i<w;i++){
            System.out.println(num[i]);
        }

        sc.close();
    }
}

