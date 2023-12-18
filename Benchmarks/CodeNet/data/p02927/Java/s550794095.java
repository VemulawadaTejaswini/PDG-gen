import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int d = sc.nextInt();
        int ans=0;
        
        for(int i=22; i<d; i++){
            String ds = "" + i;
            int d1 = Character.getNumericValue(ds.charAt(0));
            int d2 = Character.getNumericValue(ds.charAt(1));
            for(int j=1; j<=m; j++){
                if(d1*d2 == j && d2!=1){
                    ans++;
                    //System.out.println(i);
                }
            }
        }
        System.out.println(ans);
	}
}
