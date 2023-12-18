import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int total=0;
        int max=0;
        int a[]=new int[150];
        int b[]=new int[150];
        for(int i=0;i<n;i++){
            a[(int)s.charAt(i)]++;
        }
        for(int i=0;i<n;i++){
            a[(int)s.charAt(i)]--;
            b[(int)s.charAt(i)]++;
            for(int k=0;k<150;k++){
                if(a[k]>0 &&b[k]>0) total++;
            }
            if(total>max) max=total;
            total=0;
        }
        System.out.println(max);
    }
}