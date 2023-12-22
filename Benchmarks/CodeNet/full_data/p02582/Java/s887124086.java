public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);
  
  	String input = scanner.next();
	int num;
    for(int i = 0; i < 3; i++){
    	if(input.charAt(i) == 'R')
          num++;
    }
  
  	System.out.println(num);
}