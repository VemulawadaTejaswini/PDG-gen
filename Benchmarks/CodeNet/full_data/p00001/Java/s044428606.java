class Main{  
 public static void main(String[] a){    
    int f,s,t;
    int[] x = new int[a.length];
    for(int i = 0; i < a.length; i++){
    x[i] = Integer.parseInt(a[i]);
    }
    for (int i: x){
    if(x[i] >=0 && x[i]<10000)
     if(f<x[i])
      f = x[i];
     else if(s>x[i])
      s = x[i];
     else if(t>x[i])
      t = x[i]; 
    }
    System.out.println(f+"\n"+s+"\n"+t);
 }
}