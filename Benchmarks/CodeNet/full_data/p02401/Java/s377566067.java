import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=0;
        int[] a= new int[100000];
        int[] b= new int[100000];
        int[] ans= new int[100000];
        String[] op= new String[100000];
        for(int i=0;;i++){
            a[i]=sc.nextInt();
            op[i]=sc.next();
            b[i]=sc.nextInt();
            if(op[i].equals("+"))ans[i]=a[i]+b[i];
            else if(op[i].equals("-"))ans[i]=a[i]-b[i];
            else if(op[i].equals("*"))ans[i]=a[i]*b[i];
            else if(op[i].equals("/"))ans[i]=a[i]/b[i];
            else break;
            N++;
        }
        for(int i=0;i<N;i++)System.out.println(ans[i]);
        sc.close();
    }
}
