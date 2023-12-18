class Main{
	public static void main(String[] args){
    	int N = Integer.parseInt(args[0]);
      	boolean res = false;
      	while(N){
          	int x = N%10;
          	if(x==7){
            	res = true;
              	break;
            }
          	N/=10;
        }
      	if(res) System.out.print("Yes");
      	else System.out.print("No");
    }
}