class Main{  
 public static void main(String[] a){    
    int f,s,t;
    for (int i: a){
    if(a[i] >=0 &$ a[i]<10000)
     if(f<a[i])
      f = a[i];
     else if(s>a[i])
      s = a[i];
     else if(t>a[i])
      t = a[i]; 
    }
    System.out.println(f+"\n"+s+"\n"+t);
}