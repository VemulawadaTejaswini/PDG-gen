import java.util.Scanner;
public class Main{
public static void main(String[] args){
try(Scanner sc = new Scanner(System.in)){
int w = sc.nextInt();
int n = sc.nextInt();
int[] values = new int[w];
for(int i = 0; i < values.length; i++){
values[i] = i + 1;
}
sc.useDelimiter(",|\n");
for(int i = 0; i<n; i++){
int a = sc.nextInt();
int b = sc.nextInt();
int temp = values[a-1];
values[a-1] = values[b-1];
values[b-1] = temp;
}
for(int i = 0; i<values.length; i++){
System.out.println(values[i]);
}
sc.close();
}
}
}
