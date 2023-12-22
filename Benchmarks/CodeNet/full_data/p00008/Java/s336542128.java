public class Main { 
  public static void main(String[] args){
	  int count=0;
	  int a=0;
	  Scanner sc = new Scanner(System.in);
			  int n = sc.nextInt();
	  for (int i = 0;i<=9;i++) {
		  for(int j = 0;j<=9;j++) {
			  for(int k =0;k<=9;k++) {
				  for(int l = 0;l<=9;l++) {
					  a = i + j + k + l;
					  if(a==n) count++;
				  }
			  }
		  }
		  
	  }
	  System.out.println(count);
  
  }
}
