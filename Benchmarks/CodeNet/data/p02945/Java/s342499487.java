class Main {
  
  public static void main(){
    
    Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    
    int max = n*m;
    
    if(max < n+m) {
      max = n+m;
    }
    
    if(max < n-m) {
      max = n-m;
    }
    
    System.out.println(max);
  }
}