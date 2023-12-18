import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long [] ABC = {sc.nextLong(),sc.nextLong(),sc.nextLong()};
        Arrays.sort(ABC);
        long ans = 0;
        long sum = 0;
        String S = "";
        for(int i=0; i<3; i++){
            sum+=ABC[i];
            S+=(ABC[i]+" ");
        }
        HashSet<String> Set = new HashSet<>();
        Set.add(S);
        
        while(true){
            long x = ABC[0]/2;
            long y = ABC[1]/2;
            long z = ABC[2]/2;
            long [] nextABC = {x+y,y+z,z+x};
            Arrays.sort(nextABC);
            long tmpsum=0;
            String tmpS="";
            for(int i=0; i<3; i++){
                tmpsum+=nextABC[i];
                tmpS+=(nextABC[i]+" ");
                ABC[i] = nextABC[i];
            }
            if(Set.contains(tmpS)){
                System.out.println(-1);
                return;
            }else if(sum!=tmpsum){
                break;
            }
            Set.add(tmpS);
            ans++;
        }
        System.out.println(ans);
    }
}
