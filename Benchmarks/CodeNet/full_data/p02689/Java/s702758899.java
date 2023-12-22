import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int M = scan.nextInt();
                int[] H = new int[N+1];
                int[] A = new int[N+1];
                int[] B = new int[N+1];
                
                int cnt = 0;
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                ArrayList<Integer> arrayListcnt = new ArrayList<Integer>();
 
                for(int i=1; i<=N;i++){
                    H[i] = scan.nextInt();
                }
                for(int i=1; i<=M;i++){
                    A[i] = scan.nextInt();
                    B[i] = scan.nextInt();
                    arrayListcnt.add(A[i]);
                    arrayListcnt.add(B[i]);
                    
                    if(H[A[i]]<H[B[i]]){
                        arrayList.add(B[i]);
                    }
                    if(H[A[i]]>H[B[i]]){
                        arrayList.add(A[i]);
                    }
                }
                
                ArrayList<Integer> listB = new ArrayList<Integer>(new HashSet<>(arrayList));
                ArrayList<Integer> listcnt = new ArrayList<Integer>(new HashSet<>(arrayListcnt));
               
                for(int i=1; i<=M;i++){
                    for(int j=0; j<listB.size(); j++){
                        if(A[i]==listB.get(j)){
                            for(int k=0; k<listB.size(); k++){
                                if(B[i]==listB.get(k)){
                                    if(H[listB.get(j)]<H[listB.get(k)]){
                                        arrayList.remove(listB.get(j));
                                    }
                                     if(H[listB.get(j)]>H[listB.get(k)]){
                                        arrayList.remove(listB.get(k));
                                     }
                                    
                                }
                            }
                        }
                    }
                }
                    
                
                System.out.println((N-listcnt.size())+listB.size());
      
        }
}