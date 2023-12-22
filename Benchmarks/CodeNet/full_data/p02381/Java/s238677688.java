import java.util.Scanner;
public class Main {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
while(true){
int n = sc.nextInt();
if(n == 0){ break;}
int[] sum = new int[n];
for(int i = 0; i<n; i++){
  sum[i] = 0;
  sum[i] = sc.nextInt();
}
double heikin = 0;
double a = 0;
for(int i = 0; i<n; i++){
  heikin += sum[i];
}
heikin = heikin/n;
for(int i = 0; i<n; i++){
  a += Math.pow((sum[i]-heikin),2);
}
System.out.println(Math.sqrt(a/n));
}
}
}

