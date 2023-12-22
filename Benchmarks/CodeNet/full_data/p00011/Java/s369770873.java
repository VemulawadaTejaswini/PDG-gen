import java.util.Scanner;

public class Main{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int w =sc.nextInt();
 int n =sc.nextInt();
 int[] values =new int[w];
 for(int i=0;i<values.length;i++){
  values[i]=i+1;
 }
 for(int i=0;i<n;i++){
String str= sc.next();
String[]ab= str.split(",");
int a=Integer.parseInt(ab[0])-1;
int b=Integer.parseInt(ab[0])-1;
swap(values,a,b);
}
for(int i=0;i<values.length;i++){
 System.out.printf("%d\n",values[i]);
 }
}
 public static void swap(int[] values,int a,int b){
 int[] s=values;
 int t=s[a];
 s[a]=s[b];
 s[b]=t;
 }
}