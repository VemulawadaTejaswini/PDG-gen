class main{
	public static void main(String[] args){
    
    	java.util.Scanner scan = new java.util.Scanner(System.in);
      	
      	int a = scan.nextInt();
      	int b = scan.nextInt();
      	int c = scan.nextInt();
      
      if(a == b){
      	System.out.println(c);
      }
      else if(a == c){
      	System.out.println(b);
      }
      else{
        System.out.println(a);
    }
}
