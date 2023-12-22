 
import java.util.*;
 
 class Main{
    static long[] rows;
    static long[] col;
    static HashMap<Integer,Set<Integer>> has;
    
    
    public static void solve(){
        long ans =Long.MIN_VALUE;
       
        for(int i = 1; i < rows.length; i++){
             int count = 0;
            for(int j = 1; j < col.length; j++){
                count++;
                long curr = rows[i] + col[j];
                
                if(has.containsKey(i)){
                    if(has.get(i).contains(j)){
                    //    System.out.println("bhiya  " + i + " " + j);
                        curr = curr-1;
                    }
                }
                 ans = Math.max(curr,ans);
            
               if(count > rows.length * 2)
                        break;
                
                
            }
            
              if(count > rows.length * 2)
                        break;
             
            
          
           
        }
        
        System.out.println(ans);
    }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int q=sc.nextInt();
        
        rows = new long[n+1];
        col =  new long[m+1];
        has = new HashMap<Integer,Set<Integer>>();
        
        for(int i = 0; i < q; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            rows[r]++;
            col[c]++;
            
            if(has.containsKey(r)){
                has.get(r).add(c);    
            }
            
            else{
                Set<Integer> s =new HashSet<>();
                s.add(c);
                has.put(r,s);
                
            }
            
            
            
         
            
        }    
       
        solve();
        
        
    }
}