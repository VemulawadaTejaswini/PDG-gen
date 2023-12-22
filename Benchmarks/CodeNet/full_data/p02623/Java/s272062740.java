import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int M = scan.nextInt();
                int K = scan.nextInt();
               
                ArrayList<Long> A = new ArrayList<>();
                ArrayList<Long> B = new ArrayList<>();
                for(int i=0; i<N;i++){
                        long P = scan.nextLong();
                        A.add(P);
                }
                for(int i=0; i<M;i++){
                        long Q = scan.nextLong();
                        B.add(Q);
                }
                long cnt = 0;
                long time = 0;
                int as = 0;
                int bs = 0;
                while(time<=K&&(as<A.size()||bs<B.size())){
                    if(as==A.size()-1&&bs==B.size()-1){
                        break;
                    }
                    if(as>=A.size()){
                        if(time+B.get(bs)<=K){
                        cnt++;
                        time = time + B.get(bs);
                        bs++;
                        }else{
                            break;
                        }
                    }
                    else if(bs>=B.size()){
                        if(time+A.get(as)<=K){
                        cnt++;
                        time = time + A.get(as);
                        as++;
                        }else{
                            break;
                        }
                    }else{
                        if(time+A.get(as)<=K||time+B.get(bs)<=K){
                            if(A.get(as)<=B.get(bs)){
                                cnt++;
                                time = time + A.get(as);
                                as++;
                            }else{
                                cnt++;
                                time = time + B.get(bs);
                                bs++;
                            }
                        }else{
                            break;
                        }
                    }               
                }
                System.out.println(cnt);
        }               
}