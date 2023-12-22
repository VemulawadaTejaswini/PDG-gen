import java.util.*;
public class Main{
 public static void main(String[] args){
for(int i = 0 ;i <200000; i++){
 Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
if(x ==0 && y == 0) break;
else{
int c = Math.max(x,y);
int d = Math.min(x,y);
System.out.println(d + " " + c);}}
}
}
