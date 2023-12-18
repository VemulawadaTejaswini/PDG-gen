import java.util.*; 
public class Main{
 public static void main(String ... string){
  Scanner sc = new Scanner(System.in); 
  int n = sc.nextInt();
  int arr[] = new int[n]; 
  int add = 0; 
  for(int i = 0; i<n; i++){
    arr[i] = sc.nextInt();
  }
  for(int i = 0; i<n; i++){
    add += arr[i]; 
  }
  int x = 0; 
  int min = Integer.MAX_VALUE; 
  for(int i = 0; i<n-1; i++){
   x += arr[i];
   min = Math.min(min,x); 
  }
  System.out.println(min); 
 }
}