import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}

for(int i=0;i<n;i++){
    System.out.print(a[n-i-1]);
    if(i!=n-1)System.out.print(" ");
}System.out.println("");
}
}
