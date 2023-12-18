import java.util.*;

public class Main {
    public static void main(String args[]) {
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    int d[] = new int[n];
    d[0] = read.nextInt();
    int c = 0;
    for(int i=1; i<n; i++){
        d[i]=read.nextInt();
        if(d[i-1] > d[i]){
            --d[i-1];
            ++c;
        }
    }
    
    if(c>1){
        System.out.println("No");
    }else{
        boolean ban = true;
        for(int i=1; i<n;i++){
            if(d[i-1]>d[i]){
                ban = false;
                break;
            }
        }
        if(ban)
           System.out.println("Yes");
        else
           System.out.println("No");
    }
    
    
   
    }
}