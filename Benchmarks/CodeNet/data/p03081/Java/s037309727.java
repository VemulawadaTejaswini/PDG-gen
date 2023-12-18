import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        
        String str = sc.next();
        String[] ar = str.split("");
        Integer g[] = new Integer[N];
        
        for (int i=0; i<N; i++) 
            g[i] = 1;
        
        String t[]= new String[Q];
        String d[]= new String[Q];
        for (int i=0; i<Q; i++) {
            t[i] = sc.next();
            d[i] = sc.next();
        }
        /*
        for (int i=0; i<Q; i++) {
            System.out.println(t[i]);
            System.out.println(d[i]);
        }
        */
        
        int count=0;
        
        for (int j=0; j<Q; j++) {
            for (int m=0; m<N; m++){
                if (ar[m].equals(t[j])) {
                    
                    if (d[j].indexOf("L")!=-1){
                    
                        if (str.indexOf(t[j],m)==0){
                            g[0] = 0;
                            //System.out.println("g["+g[0]+"] = 0");
                        }
                        else{
                            g[m-1]+=g[m];
                            g[m] = 0;
                            //System.out.println("L");
                        }
                    }
                    
                    else if (d[j].indexOf("R")!=-1){
                        if (str.indexOf(t[j],m)==N-1){
                                g[N-1] = 0;
                                //System.out.println("g["+g[N-1]+"] = 0");
                            }
                            else{
                                g[m+1]+=g[m];
                                g[m] = 0;
                                //System.out.println("R");
                        }
                    }
                
                }
                
            }
        }

        for (int i=0; i<N; i++) {
            count+=g[i];
        }
        
        System.out.println(count);
    }

}