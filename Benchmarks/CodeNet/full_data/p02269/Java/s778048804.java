import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {
    static final PrintWriter sysOut = new PrintWriter(System.out);
    
    static class Dictionary {
        HashSet<String> hashSet = new HashSet<>();
        
        void insert (String string) {
            hashSet.add(string);
        }
        
        boolean find(String string) {
            return hashSet.contains(string);
        }
    }
    
    public static void main(String[] args) {
        BufferedReader br_dict = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            String line = "";
            while((line = br_dict.readLine()) != null && !line.isEmpty()) {
                int n_dict = Integer.parseInt(line);
                Dictionary dictionary = new Dictionary();
                
                for(int i = 0; i < n_dict; i++) {
                    StringTokenizer tokenizer = new StringTokenizer(br_dict.readLine());
                    String operation = tokenizer.nextToken();
                    String string    = tokenizer.nextToken();
                    
                    if(operation.equals("insert")) {
                        dictionary.insert(string);
                    } else {
                        if(dictionary.find(string)) sysOut.print("yes\n");
                        else sysOut.print("no\n");
                    }
                }
            }
            sysOut.flush();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
