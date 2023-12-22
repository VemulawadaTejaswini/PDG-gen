import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            char[] s1 = sc.next().toCharArray();
            char[] s2 = sc.next().toCharArray();

            int n = s1.length;
            int m = s2.length;
      
            int max = 0;
            for(int i=0; i<n; i++){
                int num = 0;
                for(int j=0; j<m; j++){
                    if(s1[i]==s2[j]){
                        int k = 1;
                        while(i+k<n && j+k<m && s1[i+k]==s2[j+k]) k++;
                        max = Math.max(max, k);
                    }
                }
            }
            
            System.out.println(max);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}