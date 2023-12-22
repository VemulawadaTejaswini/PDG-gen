import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int w=sc.nextInt();
int n=sc.nextInt();
int[] k=new int[w];
int[] a=new int[n];
int[] b=new int[n];
for(int i=0;i<w;i++){
k[i]=i+1;
}
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
b[i]=sc.nextInt();
int p=k[a[i]-1];
int q=k[b[i]-1];
k[a[i]-1]=q;
k[b[i]-1]=p;
}
for(int i=0;i<w;i++){
System.out.println(k[i]);
}
}
}