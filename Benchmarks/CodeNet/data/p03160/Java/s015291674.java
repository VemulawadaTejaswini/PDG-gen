/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codingpractice;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class AtCoder_Frog1 {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner (System.in);
  int n= sc.nextInt();
  
  int[] arr = new int[n];
  
  for(int i=0;i<n;i++){
  arr[i]=sc.nextInt();
  }
  
  int k=0;
  int sum=0;
  while(k<n-1){
  
  if(k<n-2 && Math.abs(arr[k]-arr[k+2])< Math.abs(arr[k]-arr[k+1])+Math.abs(arr[k+1]-arr[k+2])){
    sum=sum+ Math.abs(arr[k]-arr[k+2]);
    k=k+2;
  }
  
    
  else{
    sum=sum+Math.abs(arr[k]-arr[k+1]);
      k=k+1;
    }
  }
  System.out.println(sum);
    
    } 
}
    
