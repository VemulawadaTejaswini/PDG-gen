import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        String[] members = str.split("");
        while(true){
            int fCount = 0;
            boolean wasZero = false;
            for(int i = 0 ; i < (n / 2) + 1; i++){
                if(members[i].equals("0")){
                    if(!wasZero){
                        fCount++;
                    }
                    wasZero = true;
                }else{
                    wasZero = false;
                }
            }
            int sCount = 0;
            wasZero = false;
            for(int i = 0 ; i < (n / 2) + 1 ; i++){
                if(members[n - i - 1].equals("0")){
                    if(!wasZero){
                        sCount++;
                    }
                    wasZero = true;
                }else{
                    wasZero = false;
                }
            }
            
            int rest;
            if(fCount < sCount){
                if(fCount <= k){
                    rest = fCount - k;
                    if(rest == 0){
                       System.out.println( (n / 2) + 1 );
                       return;
                    }else{
                        fCount = 0;
                        wasZero = false;
                        for(int i = (n / 2) + 1; i < n; i++){
                            if(members[i].equals("0")){
                                wasZero = true;
                            }else{
                                if(wasZero){
                                    for(int  j = (n / 2) + 1; j <= i; j++){
                                        members[j] = "1";
                                    }
                                    rest -= 1;
                                    if(rest == 0){
                                        System.out.println(check(members));
                                        return;
                                    }
                                }
                                wasZero = false;
                            }
                        }
                    }
                }else{
                    n -= 2;
                    continue;
                }
            }else{
                if(sCount <= k){
                    rest = sCount - k;
                    if(rest == 0){
                       System.out.println( (n / 2) + 1 );
                       return;
                    }else{
                        sCount = 0;
                        wasZero = false;
                        for(int i = 0 ; i < (n / 2); i++){
                            if(members[n - i - i].equals("0")){
                                wasZero = true;
                            }else{
                                if(wasZero){
                                    for(int j = 0 ; i < (n / 2); i++){
                                        members[j - i - i] = "1";
                                    }
                                    rest -= 1;
                                    if(rest == 0){
                                        System.out.println(check(members));
                                        return;
                                    }
                                }
                                wasZero = false;
                            }
                        }
                    }
                }else{
                    n -= 2;
                    continue;
                }
            }
        }
    }
    
    
    public static int check(String[] members){
        int count = 1;
        int max = 0;
        boolean wasOne =  false;
        for(int i = 0; i < members.length; i++){
            if(members[i].equals("1")){
                if(wasOne){
                    count++;
                }
                wasOne = true;
            }else{
                wasOne = false;
                if(max < count)max = count;
                count = 1;
                
            }
            
        }
        return max;
    }
}
