
import java.util.*;
 
public class Main {
     
    static boolean[] num=new boolean[1000010];
     
    static void prime(int n) {
        for(int i=2; i*n<1000000; i++) {
            num[n*i]=false;
        }
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while(sc.hasNext()) {
            	int[] list=new int[1000000];
                for(int i=2; i<1000000; i++) {
                    num[i]=true;
                }
                for(int i=2; i<1000000; i++) {
                    if(num[i]) {
                        prime(i);
                    }
                }
                int[] numprime=new int[1000000];
                int k=0;
                for(int i=1; i<1000000; i++){
                	if(num[i]){
                		numprime[k]=i;
                		k++;
                	}
                }
                int N=sc.nextInt();
            	int P=sc.nextInt();
            	if(N==-1 && P==-1) break;
            	k=0;
                for(int i=0; i<1000000; i++){
                	for(int j=0; j<1000000; j++){
                		list[k]=numprime[i]+numprime[j];
                		k++;
                	}
                }
                Arrays.sort(list);
                System.out.println(list[P-1]);
            }
             
        
    }
}
