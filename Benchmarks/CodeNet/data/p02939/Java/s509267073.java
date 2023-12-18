import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) {
        // Scanner stdIn = new Scanner(System.in);
        // String s = stdIn.next();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> sp = new ArrayList<>();
        sp.add(String.valueOf(s.charAt(0)));
        s = s.substring(1,s.length());
        sp.add(String.valueOf(s.charAt(0)));
        s = s.substring(1, s.length());

        while(s.length() != 0){
            if(sp.get(sp.size() - 2).equals(sp.get(sp.size() - 1))){
                sp.set(sp.size()-1, sp.get(sp.size()-1) + String.valueOf(s.charAt(0)));
            }else{
                sp.add(String.valueOf(s.charAt(0)));
            }
            s = s.substring(1, s.length()); 
        }
        if(sp.get(sp.size()-2).equals(sp.get(sp.size()-1))){
            sp.set(sp.size()-2, sp.get(sp.size()-2) + sp.get(sp.size()-1));
            sp.remove(sp.size()-1);
        }
        System.out.println(sp.size());
   }
}