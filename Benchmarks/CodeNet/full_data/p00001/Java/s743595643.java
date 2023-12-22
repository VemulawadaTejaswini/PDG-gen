import java.io.*;
class Main{  
 public static void main(String[] a){    
    int f=0,s=0,t=0;
    int[] x = new int[10];
    try{
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    for(int i = 0; i < 10;i++){
    x[i] = Integer.parseInt(b.readLine());
    }
    }catch (IOException e) {         
    }
    for (int i: x){
    if(x[i] >=0 && x[i]<=10000)
     if(f<x[i])
      f = x[i];
     else if(s>x[i])
      s = x[i];
     else if(t>x[i])
      t = x[i]; 
    }
    System.out.println(f);
    System.out.println(s);
    System.out.println(t);
 }
}