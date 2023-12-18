import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = reader.readLine().split(" ");
        int N = Integer.parseInt(list[0]);
        int K = Integer.parseInt(list[1]);
        int[] numlist = new int[K];
        String[] l = reader.readLine().split(" ");
        for(int i=0;i<K;i++){
            numlist[i] = Integer.parseInt(l[i]);
        }
        Arrays.sort(numlist);
        System.out.println(solve(N,numlist));
	}
    public static int solve(int a,int[] numlist){
        int i = a;
        while(i<Integer.MAX_VALUE){
            if(valid(i,numlist)){
                return i;
            }
            i++;
        }
        return Integer.MAX_VALUE;
    }
    public static boolean valid(int a,int[] numlist){
        String s = String.valueOf(a);
        for(int i = 0;i<s.length();i++){
            if(search(numlist,Integer.parseInt(s.charAt(i)+""))){
                return false;
            }
        }
        return true;
    }
    public static boolean search(int[] numlist, int a){
        for(int i = 0;i<numlist.length;i++){
            if(numlist[i]==a){
                return true;
            }
        }
        return false;
    }
}
        