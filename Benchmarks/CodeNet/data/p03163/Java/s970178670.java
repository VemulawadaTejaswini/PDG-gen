class Main{
  public static void main(String... args){
    
      private static long bruteGo(int[] weight, int[] value, int W, int index, long v){
    
  		if(index >= weight.length) return v;
      if(W <= 0) return v;
      if(W >= weight[index])
       return Math.max(bruteGo(weight, value, W, index+1, v),
        bruteGo(weight, value, W-weight[index], index+1, v + value[index]));
      
      return v;
  }

  private static long brute(int N, int W, int[] weight, int[] value){
    return bruteGo(weight, value, W, 0, 0l);
  }
    
 public static void main(String... args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int W = sc.nextInt();

      int[] weight = new int[N] ;
      int[] value = new int[N] ;

      for(int i = 0; i< N; i++){
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
      }
      System.out.println(brute(N, W, weight, value));
      if(sc != null)
        sc.close();
  }
}