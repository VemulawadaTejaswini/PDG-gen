import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
  int[] arr = new int[3];

  
  for(int i=0; i<3; i++){
  arr[i] = s.nextInt();
  }
  
  if(arr[2]<Math.max(arr[0], arr[1]) && arr[2]>Math.min(arr[0], arr[1])){
  System.out.print("Yes");
  }
  System.out.print("No");
}
}