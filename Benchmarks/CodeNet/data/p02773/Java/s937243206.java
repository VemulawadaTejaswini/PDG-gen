
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;


class Main{
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        List<String> s1 = new ArrayList<String>();
        List<String> s2 = new ArrayList<String>();

        while (n >0){
            String str =  in.next();
            s1.add(str);
            n--;
        }



//        List<String> list = new ArrayList<String>(s1);
        int count = 0;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        Collections.sort(s1);
        for (String str: s1){
            if(s1.contains(str)){

                if(map.containsKey(str)){
                    map.put(str,(map.get(str)+1));
                }else {
                    map.put(str,1);
                }
            }
        }
        map = sortByValue(map);
        List<String> list1 = new ArrayList<>();
//        out.println(map);
        int max = 0;
        for (String key : map.keySet()){
//            int count1 = map.get(key);
            if ( map.get(key) >= max){
                max = map.get(key);
                list1.add(key);
//                out.println(key);
            }

        }
        Collections.sort(list1);
        for (String s : list1)
            out.println(s);



        out.close();
    }
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}