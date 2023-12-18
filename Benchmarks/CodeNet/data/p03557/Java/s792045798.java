import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int[] a=new int[n];
int[] b=new int[n];
int[] c=new int[n];
for(int i=0;i<n;i++){a[i]=Integer.parseInt(sc.next());}
for(int i=0;i<n;i++){b[i]=Integer.parseInt(sc.next());}
for(int i=0;i<n;i++){c[i]=Integer.parseInt(sc.next());}
Arrays.sort(a);
Arrays.sort(b);
Arrays.sort(c);
long ans=0;
for(int i=n-1;i>=0;i--){
    for(int j=n-1;j>=0;j--){
        if(c[i]>b[j]){
            for(int k=n-1;k>=0;k--){
                if(b[j]>a[k]){ans++;}
            }
        }
    }
}
System.out.println(ans);
}}