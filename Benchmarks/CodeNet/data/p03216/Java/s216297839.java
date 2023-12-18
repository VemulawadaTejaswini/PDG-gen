import java.util.*;
class Main {
  public static void main (String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    
		
     int n = sc.nextInt();
     String s = sc.next();
     int q = sc.nextInt();
     
     int[]k = new int [q];
     
     for(int i=0; i<q; i++){
       k[i]=sc.nextInt();
       }
       
      int [] d = new int[n];
      int [] m = new int[n];
      int [] c = new int[n];
     
     
     
       
     for(int i=0; i<n; i++){
       if(s.charAt(i)=='D'){
          d[i]++;
       }else if(s.charAt(i)=='M'){
          m[i]++;
       }else if(s.charAt(i)=='C'){
          c[i]++;
       }
      }
      
      int ans =0;
      
    for(int j=0; j<q; j++){
     for(int i=0; i<n; i++){
       if(m[i]>0){
       
          ans = ans+find(d, c, i, k[j],n);
       }
       }
       //System.out.println(c.get(0));
       System.out.println(ans);
       ans=0;
     }
  }
  
  public static int find(int[] d, int[] c, int m, int k,int n){
    
    int ans=0;
    for(int i = Math.max(0, m-k+1); i<m; i++){
      if (d[i]>0){
         for(int j=m+1; j<Math.min(n,i+k );j++){
            if(c[j]>0)ans++;
         }
     }
   }
   return ans;
}
}