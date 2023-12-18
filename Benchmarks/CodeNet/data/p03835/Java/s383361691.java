import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int s = sc.nextInt();
        int ans=0;
        int x=0;
        int y=0;
        int z=0;
        
        
        for(int i=0; i<=k; i++){
            x=i;
            for(int j=0; j<=k; j++){
                y=j;
                for(int l=0; l<=k; l++){
                    z=l;
                    if(x+y+z==s){
                        ans++;
                    }
                }
            }
        }
		System.out.println(ans);
	}
}
