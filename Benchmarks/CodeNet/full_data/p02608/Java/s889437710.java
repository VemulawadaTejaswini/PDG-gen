import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      
      	Integer a[] = new Integer[N+1];
        for (int i=1; i<=N; i++) {
            a[i] = 0;
        }
        for (int i=1; i<=N; i++) {
        	for(int x = 1; x<=30;x++){
            	for(int y = 1; y<=30;y++){
                 	 for(int z = 1; z<=30;z++){
                       if((x * x) + (y * y) + (z * z) + (x * y) + (y * z) + (z * x) == i){
                         a[i] += 1;
                       }     
        		    }
            	}
            }
        }
      
      	for (int i=1; i<=N; i++) {
            System.out.println(a[i]);
        }
         
    }
}