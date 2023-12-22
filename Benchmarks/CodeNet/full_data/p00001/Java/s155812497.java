class Main{  
 public static void main(String[] a){    
    int f=0,s=0,t=0;
    int[] x = new int[a.length];
    for(int i = 0; i < a.length; i++){
    x[i] = Integer.parseInt(a[i]);
    }
    for (int i: x){
    if(x[i] >=0 && x[i]=<10000)
     if(f<x[i])
      f = x[i];
     else if(s>x[i])
      s = x[i];
     else if(t>x[i])
      t = x[i]; 
    }
    System.out.println(f);
    System.out.println(s);
    System.out.println(f);
 }
}