    import java.util.Scanner;
     
    public class Main{
      public static void main(String[] args){
    	Scanner in=new Scanner(System.in);
    	int N=in.nextInt();
        int L=in.nextInt();
        int flavour=0;
        for(int i=1;i<=N;i++)
          flavour+=L+i-1;
//        System.out.println(flavour);
       	int max=Integer.MAX_VALUE;
        for(int i=1;i<=N;i++){
        	if(Math.abs(flavour-(L+i-1))<max){
              max=Math.abs(flavour-(L+i-1));
            }
        }
        System.out.println(max);
        in.close();
      }
    }