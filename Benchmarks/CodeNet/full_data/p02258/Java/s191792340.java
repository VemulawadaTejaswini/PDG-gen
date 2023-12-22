import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int min = 1000000000;
int profit = -1000000000;
int maxP = -1000000000;
int n = sc.nextInt();
for(int i = 0; i < n ; i++){
int val = sc.nextInt();
if(i = 0){
min = val;
continue;
}
profit = val - min;
if(profit > maxP){
 maxP = profit;
} 
if(val < min){
 min = val; 
}
 }
System.out.println(maxP);
}
}
