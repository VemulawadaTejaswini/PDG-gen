import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
      	int b = sc.nextInt();
      	int amrS= 0;
        int sho = 0:
	    int ans = 0;
      for(int i = 1 ; i < n+1 ; i++){
        sho = i;
        amrS= 0
      	while(i != 0){
          sho = i/10;
          amrS = amrS + i%10;
        }  
        if(amrS >= a && amrS <= b){
        	ans += i; 
        }  
      }
                  System.out.println(ans);
    }
}
