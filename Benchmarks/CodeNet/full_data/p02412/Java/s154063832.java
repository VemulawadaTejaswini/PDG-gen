import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            
            if(n==0 && x==0) break;
            
            int count = 0;
            for(int i=1; i<=n; i++){
                for(int j=i+1; j<=n; j++){
                    for(int k=j+1; k<=n; k++){
                        if(i+j+k == x) count++;
                    }
                }
            }
            System.out.println(count);
        }

    }

}

