import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	int count = 0;

	String[] s = new String[N]; 

	for(int i=0; i<N-1; i++){

	s[i] = sc.nextLine();

	char[] c= s[i].toCharArray();

	Arrays.sort(c);

	s[i] = new String(c);
	
  }

	for(int i=0; i<N-1; i++){

	for(int j=0; j<i; j++){
	
	if(s[i].equals(s[j])){

	count = count+1;	

   }	
		
  }	

  }			

	System.out.println(count);
	  
 }
}