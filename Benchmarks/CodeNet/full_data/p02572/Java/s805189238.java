import java.util.*;
class Main{
public static void main(String []args){
Scanner sr = new Scanner(System.in);
int n = sr.nextInt();
long []a = new long[n];
for(int i=0;i<n;i++){
a[i] = sr.nextLong();
}
long sum = 0;
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
System.out.print(sum);
sum = sum + (a[i]*a[j]);
}
}
System.out.print(sum);
}
}