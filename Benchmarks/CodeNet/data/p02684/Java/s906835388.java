
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long k = sc.nextLong();
        int[] town = new int[n];
        boolean[] b = new boolean[n];
        Long mod = 0L;
        List<Integer> visited = new ArrayList<>();
        List<Integer> loop = new ArrayList<>();

        for(int i=0;i<n;i++){
            b[i] = false;
            town[i] = sc.nextInt();
        }

        int select = 1;
        visited.add(1);
        b[0] = true;
        for(Long i=0L;i<k;i++){
            select = tp(town,select);
            if(b[select-1]){
                for(int j=0;j<visited.size();j++){
                    if(visited.get(j)==select){
                        loop = visited.subList(j,visited.size());
                        k -= visited.size()-loop.size();
                        mod = (k%loop.size());
                        break;
                    }
                }
                break;
            }else{
                visited.add(select);
                b[select-1] = true;
            }
        }

        System.out.println(loop.get(Math.toIntExact(mod)));
    }

    static int tp(int[] town,int i){
        return town[i-1];
    }
}
