import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] BIN=new int[36];
        int[] BINMINUS=new int[36];
        int[] binminus=new int[36];
        boolean isMinus=false;
        
        for(int i=0;i<36;i++){
            BIN[i]=0;
            BINMINUS[i]=0;
            binminus[i]=0;
        }
        
        if(N<0){
            N*=(-1);
            isMinus=true;
        }
        
        String S=Integer.toBinaryString(N);
        int SLEN=S.length();
        
        for(int i=0;i<SLEN;i++){
            if(S.charAt(SLEN-1-i)=='1'){
                BIN[35-i]=1;
            }
        }
        
        for(int i=1;i<36;i++){
            if(i%2==1){
                if(BIN[i]==1){
                    BINMINUS[i]+=1;
                }else{
                    BINMINUS[i]+=0;
                }
            }else{
                if(BIN[i]==1){
                    BINMINUS[i]+=1;
                    BINMINUS[i-1]+=1;
                }else{
                    
                }
            }
        }
        
        for(int i=35;i>=1;i--){
            if(BINMINUS[i]>=2){
                if(BINMINUS[i-1]>=1){
                    BINMINUS[i]-=2;
                    BINMINUS[i-1]-=1;
                }else{
                    BINMINUS[i-2]+=1;
                    BINMINUS[i-1]+=1;
                    BINMINUS[i]-=2;
                }
            }
        }
        
        if(isMinus){
            for(int i=1;i<36;i++){
                if(i%2==3){
                    if(BINMINUS[i]==1){
                        binminus[i]+=1;
                    }else{
                    
                    }
                }else{
                    if(BINMINUS[i]==1){
                        binminus[i]+=1;
                        binminus[i-1]+=1;
                    }
                }
            }
            
            for(int i=35;i>=1;i--){
                if(binminus[i]>=2){
                    if(binminus[i-1]>=1){
                        binminus[i-1]-=1;
                        binminus[i]-=2;
                    }else{
                        binminus[i-2]+=1;
                        binminus[i-1]+=1;
                        binminus[i]-=2;
                    }              
                }
            }
            
            boolean isZero=true;
            int i=0;
            while(isZero){
                if(binminus[i]==0){
                    i++;
                }else{
                    isZero=false;
                }
            }
            
            for(int j=i;j<36;j++){
                System.out.print(binminus[j]);
            }
            return;
        }
        
        boolean isZero=true;
        int i=0;
        
        while(isZero){
            if(BINMINUS[i]==0){
                i++;
            }else{
                isZero=false;
            }
        }
        
        for(int j=i;j<36;j++){
            System.out.print(BINMINUS[j]);
        }
        return;
    }
}
