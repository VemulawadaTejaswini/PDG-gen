import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();
int[] a = new int[n];
for(int j = 0;j<n;j++){
a[j]= scan.nextInt();}
for(int i = j-1;i>=0;i--){
if(i>0){System.out.println(a[i] + " ");
}
else{System.out.print(a[0]);}
}}}