import java.util.*;


class Main{
  public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
		
		int[] x= new int[5];
		
		for (int i = 0; i < 5; i++) {
		   x[i] = sc.nextInt();
		}
		
		int t = 0;
		int i = 0;
		
		do {
			if ( x[i] == 0)
			{
				t = 1;
				//System.out.println("x[i] = "+ x[i]);
			}
			else
			{
				i++;
			}
			
		}while(t == 0);
		
		System.out.println(i+1);
  }
}