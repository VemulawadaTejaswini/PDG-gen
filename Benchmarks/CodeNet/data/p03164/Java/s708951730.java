import java.util.* ; 

 class Main {
     static HashMap<String,Long> map = new HashMap<>() ; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int w = sc.nextInt() ; 
        long wt[] = new long[n] ; 
        long val[] = new long[n] ; 
        for(int i=0 ; i<n ; i++){
            wt[i] = sc.nextLong() ; 
            val[i] = sc.nextLong() ; 
        }
        System.out.println(knapSack(val, wt, n, w));
    }

    static long knapSack(long val[],long wt[],int n, int w){
        if(n==0 || w==0){
            map.put(String.valueOf(n)+" "+String.valueOf(w),(long) 0) ; 
            return map.get(String.valueOf(n)+" "+String.valueOf(w)) ;  
        }
        if(map.containsKey(String.valueOf(n)+" "+String.valueOf(w))){
            return map.get(String.valueOf(n)+" "+String.valueOf(w)) ; 
        }

        else if(wt[n-1]>w){
           map.put(String.valueOf(n)+" "+String.valueOf(w), knapSack(val, wt, n-1, w)) ; 
           return map.get(String.valueOf(n)+" "+String.valueOf(w)) ; 
        } 
        else{
            long y =  Math.max(val[n - 1] + knapSack(val, wt, n-1, w - (int)wt[n - 1]), knapSack(val, wt, n - 1, w));
            map.put(String.valueOf(n)+" "+String.valueOf(w), y) ; 
            return map.get(String.valueOf(n)+" "+String.valueOf(w)) ; 
        }
    }
}
