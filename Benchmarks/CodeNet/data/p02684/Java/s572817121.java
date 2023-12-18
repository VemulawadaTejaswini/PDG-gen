import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	long K = sc.nextLong();
      	int ans = 1;
      	int finalans1 = 1;
      	int finalans2 = 1;
      	int tel[] = new int[N+1];
      	int saiki[] = new int[N+1];
      	Arrays.fill(saiki, 0);
        
      	for(int i=1;i<=N;i++){
          tel[i] = sc.nextInt();
        }    	
   
      	for(int i=0;i<K;i++){
          saiki[ans]++;
          ans = tel[ans];
          
          if(saiki[ans]>=1){
            finalans1 = i;
            break;}
        }
      
      	for(int i=0;i<K;i++){
          saiki[ans]++;
          ans = tel[ans];
          
          if(saiki[ans]>=2){
            finalans2 = i;
            break;}
        }
      
      	long K2 = finalans2 - finalans1;
      	long K3 = K % K2;
      	int ans1 = 1;
      	for(int i=0;i<finalans1+K3;i++){
          ans1 = tel[ans1];
        }
      
    	System.out.println(ans1);
    }
}