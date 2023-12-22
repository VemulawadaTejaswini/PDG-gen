import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] line2 = line.split(" ");
        int row = Integer.parseInt(line2[0]);
        int column = Integer.parseInt(line2[1]);
        int[][] vec1= new int[row][column];
        int[] vec2 = new int[column];
        for(int j=0;j<row;j++) {
            String v = br.readLine();
            String[] v_ary = v.split(" ");
            for(int i=0;i<column;i++) {
                vec1[j][i] = Integer.parseInt(v_ary[i]);
            }        
        }
        for(int i=0;i<column;i++) {
            String v = br.readLine();
            vec2[i] = Integer.parseInt(v);
        }
        List<Integer> result = vecMul(vec1,vec2);
        print(result,column);
    }
    static void print(List<Integer> res,int column) {
        for(int i=0;i<res.size();i++) {
            System.out.println(res.get(i));
        }    
    }
    static List<Integer> vecMul(int[][] vec1,int[] vec2) {
        List<Integer> res = new ArrayList<Integer>();
        for(int j=0;j<vec1.length;j++){
            int sum = 0;
            for(int i=0;i<vec2.length;i++) {
                sum += vec1[j][i] * vec2[i];
            }
            res.add(new Integer(sum));
        }
        return res;
    }
}