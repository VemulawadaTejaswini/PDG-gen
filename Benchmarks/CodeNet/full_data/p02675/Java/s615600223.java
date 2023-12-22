class Main{
  public static void main(String[] args){
    
   int m = N % 10;
    
    switch(m){
      case 2:
     case 4:
     case 5:
     case 7:
     case 9:
    			System.out.println("hon");
    			break;
     case 0:
     case 1:
     case 6:
     case 8:
    		System.out.println("pon");
    		break;
     case 3:
     		System.out.println("bon");
    			break;
    }
  }
}