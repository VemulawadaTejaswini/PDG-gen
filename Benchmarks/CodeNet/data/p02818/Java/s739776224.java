import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		int takahasi = sc.nextInt();
    		int aoki = sc.nextInt();
    		int k = sc.nextInt();
          for(int i=1;i<=k;i++){
            if(takahasi==0&&aoki==0){
            break;}
            if(takahasi>0){
              takahasi-=1;
            }else{
              aoki-=1;
            }
          }

    		System.out.println(takahasi+ " " +aoki);
    	}
    }