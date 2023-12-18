import java.util.Scanner;

class Main{
  
	public static void main(String[] args) {
     
    	Scanner sc = new Scanner(System.in);
     
    	int s = sc.nextInt();
     
    	int[]a = new int[1000000];
     
    	for (int i = 0; i  < a.length; i++){
    		if (i == 0)
         		a[i] = s;
       		else {
         		if (a[i-1] % 2 == 0){
           		a[i] = a[i-1] /2;
                }else{
           			a[i] = a[i-1] * 3 + 1;
                }
       			}
     		}
     
    	int c = 0;
     
     	if(a[1] == 1)
       		c = 4;
     	else if (a[1] == 2)
       		c = 4;
     	else if (a[1] == 4)
       		c =4;
     	else {
     		for (int i = 0; i < a.length; i++){
       			if(a[i] == 8){
        			c = i + 5;
         			break;
      		 	}
    	 	}
     	}
     
     	System.out.println(c);
     
     sc.close();
   }
}