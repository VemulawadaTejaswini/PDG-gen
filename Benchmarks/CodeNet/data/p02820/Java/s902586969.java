
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] t=br.readLine().split("\\ ");
        int N=Integer.parseInt(t[0]);
        int K=Integer.parseInt(t[1]);
        t=br.readLine().split("\\ ");
        int R=Integer.parseInt(t[0]);
        int S=Integer.parseInt(t[1]);
        int P=Integer.parseInt(t[2]);
        int[][] dp=new int[N][3];
        //0=R, 1=S, 2=P
        String moves=br.readLine();
        String[] cc=new String[K]; Arrays.fill(cc,"");
        for(int i=0;i<N;i++){
            cc[i%K]+=moves.charAt(i);
        }
        
        int greedy=0;
        for(int i=0;i<K;i++){
            if(cc[i].charAt(0)=='r')greedy+=P;
            else if(cc[i].charAt(0)=='s')greedy+=R;
            else if(cc[i].charAt(0)=='p')greedy+=S;
            boolean used=true;
            for(int j=0;j<cc[i].length()-1;j++){
                if(cc[i].charAt(j+1)!=cc[i].charAt(j)){
                    
                        if(cc[i].charAt(j+1)=='r')greedy+=P;
                        else if(cc[i].charAt(j+1)=='s')greedy+=R;
                        else if(cc[i].charAt(j+1)=='p')greedy+=S;
                        used=true;
                }else if(used){
                    used=false;
                }else{
                    if(cc[i].charAt(j+1)=='r')greedy+=P;
                    else if(cc[i].charAt(j+1)=='s')greedy+=R;
                    else if(cc[i].charAt(j+1)=='p')greedy+=S;
                    used=true;
                }
            }   
            
        }
        System.out.println(greedy);
    }
    
}
