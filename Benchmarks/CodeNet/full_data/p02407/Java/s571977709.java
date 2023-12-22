import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();
int[] a = new int[n];

for(int i = n-1;i>0;i--){
System.out.println(a[i] + " ");
}
System.out.print(a[0]);
}}