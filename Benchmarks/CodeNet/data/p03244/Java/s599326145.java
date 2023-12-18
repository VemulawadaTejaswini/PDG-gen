import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int times = sc.nextInt();
        int [] first = new int[times/2];
        int [] second = new int[times/2];
        int result =0;
        int k = 0 ;
        int n = 0;
        
        boolean same = true;
        
        for(int i = 0 ; i<times; i++){
            if(i%2==0){
                first[k] = sc.nextInt();
                k++;
            }
            else{
                second[n] = sc.nextInt();
                n++;
            }
        }
        
        for(int i = 1; i<times/2; i++){
            
            if(first[0]!=first[i]){
                same = false;
            }
            if(second[0]!=second[i]){
                same = false;
            }
            
        }
        
        if (same == true && first[0] == second[0]){
            System.out.println(times/2);
        }
        else if(same == true && first[0]!=second[0]){
            System.out.println(0);
        }
        else{
            int [] rf = new int[times/2];
            int [] rs = new int[times/2];
        
            for(int i = 1 ; i<times/2; i++){
            
                rf[i]=0;
                rs[i]=0;
            
            }
            for(int i = 0 ; i<times/2; i++){
                for(int j = 0; j<times/2; j++){
                    if(first[i]==first[j]){
                        rf[i]++;
                    }
                    
                    if(second[i]==second[j]){
                        rs[i]++;
                    }
                }
            }
        
            int maxf = -1;
            int maxs = -1;
        
            for(int i = 0 ; i<times/2; i++){
                if(rf[i]>maxf){
                    maxf = rf[i];
                }
                if(rs[i]>maxs){
                    maxs = rs[i];
                }
            }
            System.out.println( ((times/2)-maxf) + ((times/2)-maxs) );
        }

    }
}