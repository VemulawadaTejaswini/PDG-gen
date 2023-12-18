import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String[] str=new String[N];
        
        for(int i=0;i<N;i++){
            str[i]=sc.next();
        }
        
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(str[i].equals(str[j])){
                    System.out.println("No");
                    return;
                }
            }
        }
        
        String bfo=str[0];
        int len=bfo.length();
        char last=bfo.charAt(len-1);
        
        for(int i=1;i<N;i++){
            bfo=str[i];
            if(bfo.charAt(0)!=last){
                System.out.println("No");
                return;
            }
            len=bfo.length();
            last=bfo.charAt(len-1);
        }
        
        System.out.println("Yes");
    }
}
