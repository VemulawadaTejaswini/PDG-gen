import java.io.*;
import java.util.*;
/**
 * Main
 */
public class Main {
        static Stack<Integer> subset = new Stack<>();
        static String input = "";
        static int stop = 0;
        static int mod  = 1000000007;
        static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        static HashMap<Integer,Integer> map = new HashMap<>();
        static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
       MyScanner ms  = new MyScanner();
        int N = ms.nextInt();
       HashMap<String,Integer> map = new HashMap<>();
       int max =0;
       for(int i=0;i<N;i++){
           String line = ms.nextLine();
            if(map.containsKey(line)){
                map.replace(line, map.get(line)+1);
                max = Math.max(map.get(line),max);
            }else{
                map.put(line, 1);
                max = Math.max(map.get(line),max);
            }
       }
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
                if(entry.getValue()==max){
                    list.add(entry.getKey());
                }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            pw.println(list.get(i));
        }
        pw.flush();
        

    }


       /**
1.What is the unknown: the maxium number of nodes he can buy
2.What are the data: the size of the array and  element int he array
3.What is the condition: the longest increasing usbsequece
4.What is the restriction: the 100,000 *100 = 100,000,000 = thus made N^2 for 3 second
*/

    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
   
        public MyScanner() {
           br = new BufferedReader(new InputStreamReader(System.in));
        }
   
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
   
        int nextInt() {
            return Integer.parseInt(next());
        }
   
        long nextLong() {
            return Long.parseLong(next());
        }
   
        double nextDouble() {
            return Double.parseDouble(next());
        }
   
        String nextLine(){
            String str = "";
        try {
           str = br.readLine();
        } catch (IOException e) {
           e.printStackTrace();
        }
        return str;
        }
  
     }
    
}