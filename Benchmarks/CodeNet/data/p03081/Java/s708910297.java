import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int q = std.nextInt();
        String s = std.next();
        int []count = new int[n];
        for(int i=0;i<n;i++){
            count[i] = 1;
        }
        char []t = new char[q];
        char []d = new char[q];
        for(int i=0;i<q;i++){
            t[i] = std.next().charAt(0);
            d[i] = std.next().charAt(0);
        }

        for(int i=0;i<q;i++){
            for(int j=0;j<n;j++){
                if(t[i] == s.charAt(j)){
                    if(d[i]=='R'){
                        //count[j]--;
                        if(j!=n-1)  count[j+1] = count[j+1]+count[j];
                        count[j] = 0;
                    }else{
                        //count[j]--;
                        if(j!=0)    count[j-1] = count[j-1]+count[j];
                        count[j] = 0;
                    }
                }
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += count[i];
        }
        System.out.println(sum);
        
    }
}