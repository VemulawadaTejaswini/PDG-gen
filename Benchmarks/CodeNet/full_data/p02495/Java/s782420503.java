import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
while(true){
int m = sc.nextInt();
int n = sc.nextInt();
if (m == 0 && n == 0) break;
else{
for(int i = 0; i < m; i++){
for(int j = 0; j < n; j++){
if((i + j) % 2 == 0) System.out.print("#");
else System.out.print(".");
}
System.out.println();
}
System.out.println();
}
}
}
}
 