class Main{
    
	  public int pow(int num,int count){
	    int answer=num;
	    for(int i=0;i<count;i++){
	      answer *= num;
	    }
	    return answer;
	  }
	    
	  public static void main(String args[]){
	    Main m = new Main();
	  
	    System.out.println(m.pow(2,3));
	    System.out.println(m.pow(3,3));
	  }
	}