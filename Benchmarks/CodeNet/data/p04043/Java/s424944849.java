class test{
	public static void main(String args[]){
     
      int fiveCount = 0;
      int sevenCount = 0;
       
      for(String arg: args[]){
      	if( Integer.parseInt(arg) == '5'){
          fiveCount++
        }
        if( Integer.parseInt(arg) == '7'){
          fiveCount++
        }
        
        if(fiveCount == 2 || sevenCount == 1){
          System.out.print("OK")
        }else{
          System.out.print("NO")
        }
      }
    }
}