import java.util.Scanner;

class Main{
  public static void main(String args[]){
	  Scanner s = new Scanner(System.in);
	  int[] abc = new int[3];
	  abc[0] = s.nextInt();
	  abc[1] = s.nextInt();
	  abc[2] = s.nextInt();

	  for (int i = abc.length - 1; i > 0; i--) {
		  for(int j = 0; j < i; j++) {
			  int tmp = 0;
			  if(abc[j] > abc[j + 1]) {			  
				  tmp = abc[j];
			  	  abc[j] = abc[j + 1];
			  	  abc[j + 1] = tmp;
			  }
		  }
	  }
	  System.out.println(abc[0] + " " + abc[1] + " " + abc[2]);

	  s.close();
  }
}
