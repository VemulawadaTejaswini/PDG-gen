class main{
	public static void main(String args[]){
      	int res = 0;
    	Scanner inp = new Scanner(System.in);
      	Array a = new Array();
      	for (int i = 0 ; i < 2; i++){
        	a[i] = inp.nextInt();
        }
      	for (i in a){
        	res =+ i;
        }
      	if (res >= 22){
        	System.out.print("burst");
        }
      	else{
        	System.out.print("win");
        }
    }
}