import java.util.*;
class Solution{
public static int P= 200003;
  public static void main(String[] args){
  
  Scanner sc= new Scanner(System.in);
    int N=sc.nextInt();
    int[] arr= new int[N];
     for(int i=0;i<N;i++){
        arr[i]= sc.nextInt();
     }
    int product=0;
    for(int j=0;j<N-1;j++){
    product+=(arr[0]*arr[j+1])%P;
    }
    System.out.println(product);
  
  }





}
