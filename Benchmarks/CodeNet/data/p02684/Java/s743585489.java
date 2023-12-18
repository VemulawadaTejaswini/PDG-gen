import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long N = scan.nextInt();
                long K = scan.nextLong();
                int P = (int) N;
                long[] A = new long[P+1];
                
                long ans = 1;
                long ichi = 1;
                
                for(int i=1; i<=N; i++){
                    A[i] = scan.nextInt();
                }

                ArrayList<Long> arrayList = new ArrayList<Long>();
                arrayList.add(ichi);
                
                int t=0;
                int u=0;
                while(true){
                    int answer = (int) ans;
                    ans = A[answer];
                    for(int j=0; j<arrayList.size(); j++){
                        if(ans==arrayList.get(j)){
                            if(u==1){
                                t=1;
                                break;
                            }
                            u=1;
                            break;
                        }
                    }
                    arrayList.add(ans);
        
                    if(t==1){
                        break;
                    }
                }
                
                int p=0;
                for(int i=0; i<arrayList.size(); i++){
                    if(arrayList.get(i)==arrayList.get(arrayList.size()-2)&&arrayList.get(i+1)==arrayList.get(arrayList.size()-1)){
                        p=i;
                        for(int j=i-1; j>=0; j--){
                            arrayList.remove(j);
                        }
                        arrayList.remove(arrayList.size()-2);
                        arrayList.remove(arrayList.size()-1);
                        break;
                    }
                }
                int po = (int)(K-p)%arrayList.size();
                System.out.println(arrayList.get(po));
              
        }
}