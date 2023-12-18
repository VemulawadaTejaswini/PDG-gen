import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        for(int i = 0; i < n; i++){
            str += String.valueOf(i+1);
        }
        String a = "";
        for(int i = 0; i < n; i++){
            a += sc.next();
        }
        String b = "";
        for(int i = 0; i < n; i++){
            b += sc.next();
        }
        int ansa = -1;
        int ansb = -1;
        int ind = 1;
        while(ansa < 0 || ansb < 0){
            if(str.equals(a)){
                ansa = ind;
            }
            if(str.equals(b)){
                ansb = ind;
            }
            str = nextPermutation(str);
            ind++;
        }
        System.out.println(Math.abs(ansa-ansb));
    }
    
    static String nextPermutation (String s) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i=0; i<s.length(); i++) list.add(s.charAt(i));

        int pivotPos = -1;
        char pivot = 0;
        for (int i=list.size()-2; i>=0; i--) {
            if (list.get(i) < list.get(i+1)) {
                pivotPos = i;
                pivot = list.get(i);
                break;
            }
        }

        if (pivotPos==-1 && pivot==0) return "Final";

        int L = pivotPos+1, R = list.size()-1;
        int minPos = -1;
        char min = Character.MAX_VALUE;
        for (int i=R; i>=L; i--) {
            if (pivot < list.get(i)) {
                if (list.get(i) < min) {
                    min = list.get(i);
                    minPos = i;
                }
            }
        }

        Collections.swap(list, pivotPos, minPos);
        Collections.sort(list.subList(L, R+1));

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<list.size(); i++) sb.append(list.get(i));

        return sb.toString();

    }
}