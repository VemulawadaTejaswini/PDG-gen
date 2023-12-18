import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        List<Integer> numlist = new ArrayList<>();
        List<Integer> plist = new ArrayList<>();
        for(int i=0;i<m;i++){
            int k = in.nextInt();
            numlist.add(k);
            while(k-->0) in.nextInt();
        }
        for(int i=0;i<m;i++)
            plist.add(in.nextInt());

        for(int i=0;i< 1<<n;i++){
            int att = 0;
            for(int j=0,z=0;j<m;j++){
                att = 0;
               for(int k=0;k<numlist.get(j);k++){
                   att ^= (i>>z & 1);
                   z++;
               }
               if(att == plist.get(j))  break;
               else if(j==m-1){
                   sum++;
               }
            }
        }
        System.out.println(sum);
    }
}
