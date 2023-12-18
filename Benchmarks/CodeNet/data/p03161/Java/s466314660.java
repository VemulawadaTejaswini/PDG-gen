import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st0 = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st0.nextToken());
        int k = Integer.parseInt(st0.nextToken());
        int h0 = Integer.parseInt(st1.nextToken());
        int h1=Integer.parseInt(st1.nextToken());
        if (n<=k+1){
            for(int i=2;i<n;i++){
                Integer.parseInt(st1.nextToken());
            }
            System.out.println(Math.abs(h0-h1));
            return;
        }
        List<Integer> prevHeight = new ArrayList<>();
        List<Integer> prevMinCost = new ArrayList<>();
        prevHeight.add(h1);
        prevMinCost.add(Math.abs(h0-h1));
        for(int i=2;i<n;i++){
            h1 = Integer.parseInt(st1.nextToken());
            int currMin=Integer.MAX_VALUE;
            for(int j=0;j<prevHeight.size();j++){
                int temp = prevHeight.get(j)+Math.abs(prevMinCost.get(j)-h1);
                if(currMin>temp){
                    currMin=temp;
                }
            }
            prevHeight.add(h1);
            prevMinCost.add(currMin);
            if(prevHeight.size()>k){
                prevHeight.remove(0);
                prevMinCost.remove(0);
            }
        }
        System.out.println(prevMinCost.get(prevMinCost.size()-1));
    }
}
