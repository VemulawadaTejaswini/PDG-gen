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
        
        boolean test = true;
        
        if(first[0]==second[0]){
            System.out.println(times/2);
            test = false;
        }
        
        for(int i = 0 ; i<(times/2) ; i++){
            if(first[i]!=first[0] || second[i]!=second[0]){
                result++;
            }
        }
        
        if(test !=false){
            System.out.println(result);    
        }
        
        
    }
}