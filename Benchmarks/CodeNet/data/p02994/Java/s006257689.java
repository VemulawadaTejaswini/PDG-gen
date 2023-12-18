    import java.util.Scanner;
     
    public class Main{
      public static void main(String[] args){
    	Scanner in=new Scanner(System.in);
    	int N=in.nextInt();
        int L=in.nextInt();
        int flavour=0;
        for(int i=1;i<=N;i++)
          flavour+=i+L-1;
       	int min=Integer.MAX_VALUE;
        for(int i=1;i<=N;i++){
        	if(flavour-(i+L-1)<min)
              min=flavour-(i+L-1);
        }
        System.out.println(min);
        in.close();
      }
    }