import java.util.Scanner;

    class Main{
    	public static void main(String args[]){
    		Scanner sc = new Scanner(System.in);
            int    n,i;
            n = sc.nextInt();
                i= 2;
                while(n!=1){
                	
                  if (n%i==0){
                      System.out.print(i + "");
                        n/= i;
                  }else	i++;
                }
    	}
    }