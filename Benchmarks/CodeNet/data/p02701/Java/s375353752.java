import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 

        int n = sc.nextInt();
        int sum_arr[] =new int[100000];
        int sum = 0;
        String s_arr[] = new String[100000]; 

        
        for( int i=0 ; i<n ; i++ ){
            String s = sc.next(); 
            s_arr[i] = s;
        }

        for( int i=0 ; i<n ; i++ ){
            for( int j=i+1 ; j<=n ; j++ ){
                if(s_arr[i].equals(s_arr[j])){
                    sum_arr[i]+=1;
                } 
            }
        }

        for(int check: sum_arr){
            if(check!=0){
                sum--;
            }
        }

        System.out.println(sum+n);
    }
    
}